package pl.strefakursow.kursspring.domain;

import org.junit.jupiter.api.Test;
import pl.strefakursow.kursspring.domain.Castle;
import pl.strefakursow.kursspring.domain.Jedi;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CastleTest {

    @Test
    public void castleToStringMessage() {
        Jedi jedi = new Jedi();
        Castle castle = new Castle(jedi,"\"NewCastle United F.C.\"");
        Quest quest = new Quest();
        jedi.setQuest(quest);
        String expect = "CastleToString: Znajduje się tu zamek o nazwie \"NewCastle United F.C.\" rycerz: Jedi{name='Yoda', age=100, quest=Order 66}";
        //Castle castle = new Castle(jedi);
        assertEquals(expect,castle.toString());
    }
}