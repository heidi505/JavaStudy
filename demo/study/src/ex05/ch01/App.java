package ex05.ch01;

public class App {
    static void attackZtoD(Zealot u1, Dragoon u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격당했습니다");
        System.out.println(u2.name + "의 남은 hp:" + u2.hp);
    }

    static void attackZtoZ(Zealot u1, Zealot u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격당했습니다");
        System.out.println(u2.name + "의 남은 hp:" + u2.hp);

    }

    static void attackZtoDT(Zealot u1, DarkTempler u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격당했습니다");
        System.out.println(u2.name + "의 남은 hp:" + u2.hp);

    }

    static void attackDtoZ(Dragoon u1, Zealot u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격당했습니다");
        System.out.println(u2.name + "의 남은 hp:" + u2.hp);
    }

    static void attackDtoD(Dragoon u1, Dragoon u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격당했습니다");
        System.out.println(u2.name + "의 남은 hp:" + u2.hp);

    }

    static void attackDtoDT(Dragoon u1, DarkTempler u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격당했습니다");
        System.out.println(u2.name + "의 남은 hp:" + u2.hp);

    }

    static void attackDTtoDT(DarkTempler u1, DarkTempler u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격당했습니다");
        System.out.println(u2.name + "의 남은 hp:" + u2.hp);

    }

    static void attackDTtoZ(DarkTempler u1, Zealot u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격당했습니다");
        System.out.println(u2.name + "의 남은 hp:" + u2.hp);

    }

    static void attackDTtoD(DarkTempler u1, Dragoon u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격당했습니다");
        System.out.println(u2.name + "의 남은 hp:" + u2.hp);

    }

    public static void main(String[] args) {
        Zealot z1 = new Zealot("질럿1", 100, 10);
        Zealot z2 = new Zealot("질럿2", 100, 10);
        Dragoon d2 = new Dragoon("드라군2", 100, 5);
        Dragoon d1 = new Dragoon("드라군1", 100, 5);
        DarkTempler dt1 = new DarkTempler("다크템플러1", 100, 20);
        DarkTempler dt2 = new DarkTempler("다크템플러2", 100, 20);

        // 다크 -> 다크
        attackDTtoDT(dt1, dt2);
        // 다크 -> 드라군
        attackDTtoD(dt1, d1);
        // 다크 -> 질럿
        attackDTtoZ(dt1, z2);

        // 질럿 -> 질럿
        attackZtoZ(z1, z2);
        // 질럿 -> 드라군
        attackZtoD(z1, d1);
        // 질럿 -> 다크
        attackZtoDT(z1, dt1);

        // 드라군 -> 드라군
        attackDtoD(d1, d2);
        // 드라군 -> 질럿
        attackDtoZ(d1, z1);
        // 드라군 -> 다크
        attackDtoDT(d1, dt1);

    }
}
