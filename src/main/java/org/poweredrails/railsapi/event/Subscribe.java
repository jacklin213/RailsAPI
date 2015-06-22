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

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <h3>Subscribe</h3>
 * 
 * <p>An annotation used to mark methods as an event. The method being
 * targeted must be public and must be in a class that is also public.</p>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD })
public @interface Subscribe {

    /**
     * <h6>Ignore Revoked</h6>
     *
     * <p>Whether the handler should ignore revoked events. If ignoreRevoked is
     * true and the event is revoked, the method is not called. Otherwise, the
     * method is always called.</p>
     */
    boolean ignoreRevoked() default true;
}
