/*
 * Copyright 2014 The original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.vaadin.spring.events;

import org.springframework.context.annotation.Scope;

/**
 * An event bus for {@link org.vaadin.spring.events.EventScope#SESSION} scoped events.
 * The event bus can be used as is, or chained to an {@link org.vaadin.spring.events.ApplicationEventBus}.
 *
 * @author Petter Holmström (petter@vaadin.com)
 */
@Scope("session")
public class SessionEventBus extends ScopedEventBus {

    public SessionEventBus() {
    }

    public SessionEventBus(ApplicationEventBus parentEventBus) {
        super(parentEventBus);
    }

    @Override
    protected EventScope getScope() {
        return EventScope.SESSION;
    }
}