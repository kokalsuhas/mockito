/*
 * Copyright (c) 2007 Mockito contributors 
 * This program is made available under the terms of the MIT License.
 */
package org.mockito.internal.matchers;


public class Same implements IArgumentMatcher {

    private final Object wanted;

    public Same(Object wanted) {
        this.wanted = wanted;
    }

    public boolean matches(Object actual) {
        return wanted == actual;
    }

    public void appendTo(StringBuffer buffer) {
        buffer.append("same(");
        appendQuoting(buffer);
        buffer.append(wanted);
        appendQuoting(buffer);
        buffer.append(")");
    }

    private void appendQuoting(StringBuffer buffer) {
        if (wanted instanceof String) {
            buffer.append("\"");
        } else if (wanted instanceof Character) {
            buffer.append("'");
        }
    }
}
