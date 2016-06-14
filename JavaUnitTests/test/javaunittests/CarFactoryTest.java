/*
 * Copyright (C) 2016 CodeFireUA <edu@codefire.com.ua>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package javaunittests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CodeFireUA <edu@codefire.com.ua>
 */
public class CarFactoryTest {
    
    private CarFactory carFactory;
    
    public CarFactoryTest() {
    }
    
    @Before
    public void setUp() {
        carFactory = new CarFactory();
    }
    
    @After
    public void tearDown() {
        carFactory = null;
    }

    @Test
    public void testMakeAutoType() {
        Car auto = carFactory.makeAuto();
        
        assertEquals(Auto.class, auto.getClass());
    }
    
    @Test
    public void testMakeAutoProps() {
        Car auto = carFactory.makeAuto();
        
        assertEquals("Unknown", auto.getMark());
        assertEquals("Unknown", auto.getModel());
        assertEquals("Unknown", auto.getColor());
    }
    
    @Test
    public void testmakeAutoType() {
        Car auto = carFactory.makeAutoBlack("Tesla", "Model S");
        
        assertEquals(Auto.class, auto.getClass());
    }
    
    @Test
    public void testmakeAutoBlack() {
        Car auto = carFactory.makeAutoBlack("Tesla", "Model S");
        
        assertEquals("Tesla", auto.getMark());
        assertEquals("Model S", auto.getModel());
        assertEquals("Black", auto.getColor());
    }
    
}
