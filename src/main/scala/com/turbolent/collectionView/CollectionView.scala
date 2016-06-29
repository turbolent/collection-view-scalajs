package com.turbolent.collectionView

import org.scalajs.dom

import scala.scalajs.js


@js.native
class CollectionView(element: dom.Element, layout: Layout, delegate: Delegate) extends js.Object {
  def updateCurrentIndices(): Unit = js.native
  def resize(): Unit = js.native
  def changeIndices(removed: js.Array[Int], added: js.Array[Int], moved: js.Dictionary[Int]): Unit = js.native
}
