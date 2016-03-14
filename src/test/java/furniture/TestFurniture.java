package furniture;

import furniture.furnitureService.FurnitureService;
import furniture.furnitureService.furnitureServiceImpl.FurnitureServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by lodz on 2016/03/13.
 */
public class TestFurniture {
    FurnitureService furniture;

    @org.junit.Before
    public void setUp() throws Exception {
        furniture = new FurnitureServiceImpl();

    }

    @org.junit.Test
    public void testFurniture() throws Exception {
        Assert.assertEquals("type", furniture.wood());
    }
}
