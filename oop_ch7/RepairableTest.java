package oop_ch7;

interface Repairable {}

class TerranUnit {
    int nowHP;
    final int MAX_HP;

    TerranUnit(int HP) {
        MAX_HP = HP;
    }
}

class TerranGroundUnit extends TerranUnit {
    TerranGroundUnit(int HP) {
        super(HP);
    }
}

class TerranAirUnit extends TerranUnit {
    TerranAirUnit(int HP) {
        super(HP);
    }
}

class Marine2 extends TerranGroundUnit {
    Marine2() {
        super(40);
        super.nowHP = 40;
    }

    @Override
    public String toString() {
        return "Marine";
    }
}

class Tank2 extends TerranGroundUnit implements Repairable {
    Tank2() {
        super(150);
        super.nowHP = 150;
    }

    @Override
    public String toString() {
        return "Tank";
    }
}

class SCV extends TerranGroundUnit implements Repairable {
    public SCV() {
        super(60);
        super.nowHP = 60;
    }

    @Override
    public String toString() {
        return "SCV";
    }

    public void repair(Repairable r) {
        if (r instanceof TerranUnit) {
            TerranUnit t = (TerranUnit) r;
            System.out.println(t.toString() + " is repairing...");
            while (t.nowHP < t.MAX_HP)
                t.nowHP += 1;
        }
    }
}

class DropShip2 extends TerranAirUnit implements Repairable {
    public DropShip2() {
        super(125);
        super.nowHP = 125;
    }

    @Override
    public String toString() {
        return "DropShip";
    }
}

public class RepairableTest {
    public static void main(String[] args) {
        Tank2 tank2 = new Tank2();
        DropShip2 dropShip = new DropShip2();
        Marine2 marine2 = new Marine2();
        SCV scv = new SCV();

        scv.repair(tank2);
        scv.repair(dropShip);
    }
}
