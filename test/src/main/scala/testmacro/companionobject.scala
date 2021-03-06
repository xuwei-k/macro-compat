/*
 * Copyright (c) 2015 Miles Sabin
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

package companionobject

import scala.reflect.macros.whitebox


@macrocompat.bundle
class ClassWithoutCompanionObject(val c: whitebox.Context)


@macrocompat.bundle
class ClassWithCompanionObject(val c: whitebox.Context)

object ClassWithCompanionObject {
  def foo = 1
}


trait ClassWithCompanionObjectMixin {
  def bar = 1
}

@macrocompat.bundle
class ClassWithCompanionObjectWithMixin(val c: whitebox.Context)

object ClassWithCompanionObjectWithMixin extends AnyRef with ClassWithCompanionObjectMixin {
  def foo = 1
}


abstract class ClassWithCompanionObjectParent {
  def bar = 1
}

@macrocompat.bundle
class ClassWithCompanionObjectWithParent(val c: whitebox.Context)

object ClassWithCompanionObjectWithParent extends ClassWithCompanionObjectParent {
  def foo = 1
}
