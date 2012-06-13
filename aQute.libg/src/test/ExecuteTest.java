/*
 * Copyright (c) OSGi Alliance (2012). All Rights Reserved.
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

package test;

import junit.framework.*;
import aQute.libg.command.*;

public class ExecuteTest extends TestCase {

	public void testSimple() throws Exception {
		Command c = new Command();
		c.add("java");
		c.add("-version");
		assertEquals(0, c.execute(System.out, System.err));
	}

	// public void testCoffee() throws Exception {
	// Command c = new Command();
	// c.arg("sh", "-c", "coffee -sc")
	// //
	// .var("PATH",
	// "/opt/local/bin:/opt/local/sbin:/Developer/usr/bin:/opt/local/bin:/opt/local/sbin:/usr/bin:/bin:/usr/sbin:/sbin:/usr/local/bin:/usr/X11/bin:/usr/local/git/bin");
	// assertEquals(0, c.execute("()->1", System.out, System.err));
	// }
}
