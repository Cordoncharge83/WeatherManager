/*
 * Copyright 2014 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terasology.weatherManager.weather;

/**
* Created by Linus on 8-11-2014.
*/
public final class ConditionAndDuration {
    public final WeatherCondition condition;
    public final float duration;

    public ConditionAndDuration(final WeatherCondition condition, final float duration) {
        this.condition = condition;
        this.duration = duration;
    }

    public String toString() {
        return condition.toString() + " (" + duration + ")";
    }
}
