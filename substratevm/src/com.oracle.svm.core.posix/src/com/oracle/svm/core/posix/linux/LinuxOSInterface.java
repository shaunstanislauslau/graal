/*
 * Copyright (c) 2012, 2017, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package com.oracle.svm.core.posix.linux;

import org.graalvm.nativeimage.Platform;
import org.graalvm.nativeimage.Platforms;

import com.oracle.svm.core.os.OSInterface;
import com.oracle.svm.core.posix.PosixOSInterface;

@Platforms(Platform.LINUX.class)
public class LinuxOSInterface extends PosixOSInterface {

    /**
     * An explicit default constructor.
     *
     * See the note on {@linkplain OSInterface#OSInterface}.
     *
     * There is no explicit instantiation of this class. NativeImageGenerator.createOSInterface
     * creates an instance by calling "newInstance()" on this class.
     */
    @Platforms(Platform.HOSTED_ONLY.class)
    public LinuxOSInterface() {
        super();
    }
}
