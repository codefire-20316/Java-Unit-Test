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

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CodeFireUA <edu@codefire.com.ua>
 */
public class DumperTest {
    
    public DumperTest() {
    }

    @Test
    public void testMakeInsert() {
        int id = 1;
        double value = Math.PI;
        String line = "Hello World!";
        String insert = Dumper.makeInsert("test", id, value, line);
        
        assertEquals(String.format("INSERT INTO `test` VALUES (%s, %s, '%s');", id, value, line), insert);
    }

    @Test
    public void testMakeInsertWithNullTable() {
        int id = 1;
        double value = Math.PI;
        String line = "Hello World!";
        String insert = Dumper.makeInsert(null, id, value, line);
        
        assertEquals(null, insert);
    }

    @Test
    public void testMakeInsertWithEmptyTable() {
        int id = 1;
        double value = Math.PI;
        String line = "Hello World!";
        String insert = Dumper.makeInsert("", id, value, line);
        
        assertEquals(null, insert);
    }

    @Test
    public void testMakeInsertWithEmptyValues() {
        int id = 1;
        double value = Math.PI;
        String line = "Hello World!";
        String insert = Dumper.makeInsert("test");
        
        assertEquals(null, insert);
    }
    
}
