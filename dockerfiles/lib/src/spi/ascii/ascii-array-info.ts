/*
 * Copyright (c) 2016-2017 Red Hat, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Red Hat, Inc.- initial API and implementation
 */
/**
 * Provides data about ascii array.
 * @author Florent Benoit
 */
export interface AsciiArrayInfo {

    /**
     * Provides size of each column.
     */
    getColumnsSize() : Array<number>;
}
