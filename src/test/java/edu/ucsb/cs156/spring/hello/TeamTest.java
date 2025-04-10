package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }
    
    @Test
    public void testEquals_SameObject() {
        Team team = Developer.getTeam();
        assertEquals(team, team); // reflexivity
    }

    @Test
    public void testEquals_IdenticalTeam() {
        Team team1 = Developer.getTeam();
        Team team2 = Developer.getTeam();
        // They are two separate objects with the same data
        assertEquals(team1, team2);
    }

    @Test
    public void testEquals_DifferentName() {
        Team team1 = Developer.getTeam();
        Team team2 = new Team("different-name");
        team2.setMembers(new ArrayList<>(team1.getMembers()));
        assertNotEquals(team1, team2);
    }

    @Test
    public void testEquals_DifferentMembers() {
        Team team1 = Developer.getTeam();
        Team team2 = new Team("s25-09");
        team2.addMember("Someone");
        team2.addMember("Else");
        assertNotEquals(team1, team2);
    }

    @Test
    public void testEquals_Null() {
        Team team = Developer.getTeam();
        assertNotEquals(team, null);
    }

    @Test
    public void testEquals_DifferentClass() {
        Team team = Developer.getTeam();
        String notATeam = "Not a team";
        assertNotEquals(team, notATeam);
    }

    @Test
    public void testHashCode_ConsistentWithEquals() {
        Team team1 = Developer.getTeam();
        Team team2 = Developer.getTeam();
        assertEquals(team1.hashCode(), team2.hashCode());
    }

    @Test
    public void testToString_ContainsNameAndMembers() {
        Team team = Developer.getTeam();
        String result = team.toString();
        assertTrue(result.contains("s25-09"));
        assertTrue(result.contains("Ruben"));
        assertTrue(result.contains("Joel"));
    }
    
    @Test
    public void testHashCode_SameNameAndOneMember() {
        Team t1 = new Team();
        t1.setName("foo");
        t1.addMember("bar");
        Team t2 = new Team();
        t2.setName("foo");
        t2.addMember("bar");
        assertEquals(t1.hashCode(), t2.hashCode());
    }

    @Test
    public void testHashCode_ChangesWhenNameChanges() {
        Team t1 = new Team();
        t1.setName("foo");
        t1.addMember("bar");
        Team t2 = new Team();
        t2.setName("baz");
        t2.addMember("bar");
        assertNotEquals(t1.hashCode(), t2.hashCode());
    }

    @Test
    public void testHashCode_ChangesWhenMembersChange() {
        Team t1 = new Team();
        t1.setName("foo");
        t1.addMember("bar");
        Team t2 = new Team();
        t2.setName("foo");
        t2.addMember("baz");
        assertNotEquals(t1.hashCode(), t2.hashCode());
    }
    @Test
    public void testEquals_SameInstance() {
        Team team = Developer.getTeam();
        assertEquals(team, team);  // triggers `if (obj == this)`
    }
    
}
