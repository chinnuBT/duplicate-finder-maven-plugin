/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
import static org.basepom.mojo.duplicatefinder.groovy.ITools.*

def (result, xml) = loadXmlAndResult(basedir, "test")

// the jolokia agent actually conflicts quite a bit, so there are two expected conflicts.
// an additional conflict is the tools jar with the rt.jar from the runtime
overallState(NO_CONFLICT, 3, NOT_FAILED, result)

return true