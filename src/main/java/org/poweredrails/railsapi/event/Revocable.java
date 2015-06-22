/*
 * This file is a component of Powered Rails, this license makes sure any work
 * associated with Powered Rails, must follow the conditions of the license included.
 *
 * Copyright 2015 PoweredRails
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.poweredrails.railsapi.event;

/**
 * <h3>Revocable</h3>
 *
 * <p>Represents an event that can be revoked.</p>
 */
public interface Revocable {

    /**
     * <h6>Set Revoked</h6>
     *
     * <p>Sets the revoke state of an {@link Event}. If set to
     * {@code true}, revokes an {@link Event}.</p>
     *
     * @param revoke The revoked state
     */
    void setRevoked(boolean revoke);

    /**
     * <h6>Is Revoked</h6>
     *
     * <p>Returns {@code true} if the {@link Event} has been revoked.</p>
     *
     * @return the event revoke state
     */
    boolean isRevoked();

    /**
     * <h6>Was Revoked</h6>
     *
     * <p>Returns {@code true} if the {@link Event} has been revoked
     * during this Server Instance. This will reset when the server
     * has been stopped or reloaded.</p>
     *
     * @return the events past revoke state
     */
    boolean wasRevoked();

}
