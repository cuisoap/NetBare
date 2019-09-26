/*  NetBare - An android network capture and injection library.
 *  Copyright (C) 2018-2019 Megatron King
 *  Copyright (C) 2018-2019 GuoShi
 *
 *  NetBare is free software: you can redistribute it and/or modify it under the terms
 *  of the GNU General Public License as published by the Free Software Found-
 *  ation, either version 3 of the License, or (at your option) any later version.
 *
 *  NetBare is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 *  without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
 *  PURPOSE. See the GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License along with NetBare.
 *  If not, see <http://www.gnu.org/licenses/>.
 */
package com.github.megatronking.netbare.ssl;

import javax.net.ssl.KeyManager;

import androidx.annotation.Nullable;

/**
 * A security provider provides the sources of authentication keys. The {@link KeyManager[]}
 * instance would be used to initialize {@link javax.net.ssl.SSLContext}.
 *
 * @author Megatron King
 * @since 2019/3/31 10:56
 */
public interface SSLKeyManagerProvider {

    /**
     * Provides an authentication keys or null.
     *
     * @param host   The peer host.
     * @param client Whether the SSLContext is initialized for client.
     *
     * @return The sources of authentication keys or null.
     */
    @Nullable
    KeyManager[] provide(String host, boolean client);

}
