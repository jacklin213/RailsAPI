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
package org.poweredrails.railsapi.server;

/**
 * <h3>Server State</h3>
 *
 * <p>Represents the server lifecycle. From top to bottom.</p>
 */
public enum ServerState {

    /**
     * <h6>Pre Build</h6>
     *
     * <p>At this stage, a server instance has been created and is beginning
     * to start the first Element Managers. No plugin instance exists.</p>
     */
    PRE_BUILD,

    /**
     * <h6>Build</h6>
     *
     * <p>At this stage, plugin instances are being created.</p>
     */
    BUILD,

    /**
     * <h6>Built</h6>
     *
     * <p>At this stage, plugin instances should be created. Loggers,
     * Configurations and Databases should be accessible at this point.</p>
     */
    BUILT,

    /**
     * <h6>Pre Initialization</h6>
     *
     * <p>At this stage, all element managers should be functional. Timers, tools
     * and commands are now accessible.</p>
     */
    PRE_INITIALIZATION,

    /**
     * <h6>Initialization</h6>
     *
     * <p>At this stage, all objects that are registered with an element manager
     * should be finished. </p>
     */
    INITIALIZATION,

    /**
     * <h6>Server Building</h6>
     *
     * <p>At this stage, the server instance has been created and the
     * world manager is accessible, but not loading.</p>
     */
    SERVER_BUILDING,

    /**
     * <h6>Server Load</h6>
     *
     * <p>At this stage, the worlds are beginning to load.</p>
     */
    SERVER_LOAD,

    /**
     * <h6>Server Loaded</h6>
     *
     * <p>At this stage, the worlds have loaded and populated.
     * It is also ready to accept clients.</p>
     */
    SERVER_LOADED,

    /**
     * <h6>Server Stopping</h6>
     *
     * <p>At this stage, clients have been kicked and cannot join
     * until the server is started again.</p>
     */
    SERVER_STOPPING,

    /**
     * <h6>Server Unloading</h6>
     *
     * <p>At this point, the worlds are being saved, unpopulated and
     * finally unloaded.</p>
     */
    SERVER_UNLOADING,

    /**
     * <h6>Server Stopped</h6>
     *
     * <p>At this point, worlds have been unloaded, connections close completely and all plugin
     * instances are stopping.</p>
     */
    SERVER_STOPPED

}
