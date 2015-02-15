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
package org.terasology.weatherManager;

import org.junit.Test;
import org.terasology.weatherManager.systems.MarkovChainWeatherGenerator;
import org.terasology.world.time.WorldTime;

/**
 * Created by Linus on 5-11-2014.
 */
public class WeatherConditionTest {

    @Test
    public void printNrOfDownfallConditions() {
        MarkovChainWeatherGenerator markovChainWeatherGenerator = new MarkovChainWeatherGenerator(3456, 6.0f);

        //warm up
        for (int i = 0; i < 100; i++) {
            System.out.println(i + ": " + markovChainWeatherGenerator.getNext());
        }
        /*
        System.out.println( WeatherCondition.values().length + " conditions:");
        for (WeatherCondition condition: WeatherCondition.values()) {
            System.out.println("\t" + condition + "(" + condition.likelihood() + ")");
        }
        */
    }
}
