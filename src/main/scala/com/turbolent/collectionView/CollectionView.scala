package com.turbolent.collectionView

import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport


@JSImport("collection-view", "CollectionView")
@js.native
class CollectionView(element: dom.Element, layout: Layout, delegate: Delegate) extends js.Object {
  def updateCurrentIndices(): Unit = js.native
  def resize(): Unit = js.native
  def changeIndices(removed: js.Array[Int], added: js.Array[Int], moved: js.Dictionary[Int]): Unit = js.native
  def uninstall(): Unit = js.native
  def updateLayout(newLayout: Layout, completion: js.Function0[Unit]): Unit = js.native

  def contentSize: js.Array[Int] = js.native
  def containerSize: js.Array[Int] = js.native
  def scrollPosition: js.Array[Int] = js.native
}
