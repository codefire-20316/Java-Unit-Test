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

/**
 *
 * @author CodeFireUA <edu@codefire.com.ua>
 */
public class Dumper {

    public static String makeInsert(String table, Object... values) {
        if (table == null || table.isEmpty() || values.length < 1) {
            return null;
        }
        
        StringBuilder sb = new StringBuilder(String.format("INSERT INTO `%s` VALUES (", table));

        int i = 0;
        for (Object value : values) {
            if (value instanceof Number) {
                sb.append(value);
            } else {
                sb.append("'").append(value).append("'");
            }
            
            if (++i < values.length) {
                sb.append(", ");
            }
        }
        sb.append(");");

        return sb.toString();
    }

}
