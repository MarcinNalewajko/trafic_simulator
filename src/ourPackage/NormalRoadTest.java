package ourPackage;

import org.junit.Test;

import static org.junit.Assert.*;

public class NormalRoadTest extends Roads {

    @Test
    public void roadConstructor(){
        int posX = 10;
        int posY = 10;
        int roadsize = 100;
        NormalRoad normalRoad=new NormalRoad(posX,posY,roadsize);
        System.out.println("Class of object");
        assertEquals(NormalRoad.class, normalRoad.getClass());
        System.out.println("Correct");
        System.out.println("Position X");
        assertEquals(posX, normalRoad.getPositionX());
        System.out.println("Correct");
        System.out.println("Position Y");
        assertEquals(posY, normalRoad.getPositionY());
        System.out.println("Correct");
        System.out.println("Size of object");
        assertEquals(roadsize, normalRoad.getWidth());
        assertEquals(roadsize, normalRoad.getHeight());

    }

}