import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Apptest {
    @Test
    void ArrayList_클래스가_존재한다() {
        MakeArrayList al = new MakeArrayList();

    }

    @Test
    void size() {
        MakeArrayList al = new MakeArrayList();
        assertEquals(0, al.size());
    }

    @Test
    void add() {
        MakeArrayList al = new MakeArrayList();
        al.add(100);
    }

    @Test
    void get() {
        MakeArrayList al = new MakeArrayList();
        al.add(100);
        int rs = al.get(0);

        assertEquals(100, rs);
    }

    @Test
    void addsize_증가() {
        MakeArrayList al = new MakeArrayList();
        al.add(100);
        al.add(200);
        al.add(300);

        assertEquals(3, al.size());
    }

    @Test
    void get_1_equals_200() {
        MakeArrayList al = new MakeArrayList();
        al.add(100);
        al.add(200);
        al.add(300);
        int rs = al.get(1);

        assertEquals(200, rs);
    }

    @Test
    void removeAt() {
        MakeArrayList al = new MakeArrayList();
        al.add(100);
        al.add(200);
        al.add(300);

        al.removeAt(1);
    }


    @Test
    void removeAt을_실행하면_size가_1_줄어든다() {
        MakeArrayList al = new MakeArrayList();
        al.add(100);
        al.add(200);
        al.add(300);

        assertEquals(3, al.size());

        al.removeAt(1);

        assertEquals(2, al.size());
    }

    @Test
    void removeAt을_실행하면_뒷좌석에_있는_데이터들이_전부_한칸씩_앞으로_이동() {
        MakeArrayList al = new MakeArrayList();
        al.add(100);
        al.add(200);
        al.add(300);

        assertEquals(200, al.get(1));

        al.removeAt(1);

        assertEquals(300, al.get(1));
    }
    @Test
    void 최초에_배열의_크기는_2_이다() {
        MakeArrayList al = new MakeArrayList();

        assertEquals(2, al.getArrayLength());
    }

    @Test
    void 배열이_꽉_차면_2배_크기로_증가해야_한다() {
        MakeArrayList al = new MakeArrayList();
        al.add(100);
        al.add(200);
        assertEquals(2, al.getArrayLength());
        al.add(300);
        assertEquals(4, al.getArrayLength());
    }

    @Test
    void showAllValues() {
        MakeArrayList al = new MakeArrayList();
        al.add(100);
        al.add(200);
        al.add(300);

        ByteArrayOutputStream output = TestUtil.setOutToByteArray();

        al.showAllValues();

        String rs = output.toString();

        TestUtil.clearSetOutToByteArray(output);

        assertTrue(rs.contains("== 전체 데이터 출력 =="));
        assertTrue(rs.contains("0 : 100"));
        assertTrue(rs.contains("1 : 200"));
        assertTrue(rs.contains("2 : 300"));
    }
}
