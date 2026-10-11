package org.shared.entity;

import org.junit.jupiter.api.Test;
import org.neo4j.ogm.metadata.MetaData;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

class EntityLabelMappingTest {

    private final MetaData metaData = new MetaData("org.shared.entity");

    @Test
    void mapsExplicitNodeLabels() {
        assertEquals(Set.of("Conversation"), Set.copyOf(metaData.classInfo(Conversation.class).staticLabels()));
        assertEquals(Set.of("Group", "Conversation"), Set.copyOf(metaData.classInfo(Group.class).staticLabels()));
        assertEquals(Set.of("Message"), Set.copyOf(metaData.classInfo(Message.class).staticLabels()));
        assertEquals(Set.of("User"), Set.copyOf(metaData.classInfo(User.class).staticLabels()));
        assertEquals(Set.of("Settings"), Set.copyOf(metaData.classInfo(Settings.class).staticLabels()));
    }

    @Test
    void resolvesGroupFromInheritedAndSpecificLabels() {
        assertSame(metaData.classInfo(Group.class), metaData.resolve("Conversation", "Group"));
    }
}
