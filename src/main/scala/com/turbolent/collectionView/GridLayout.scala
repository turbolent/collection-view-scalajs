package com.turbolent.collectionView

import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport


@JSImport("collection-view", "GridLayout")
@js.native
class GridLayout extends Layout {
  override def getContentSize(count: Int, containerSize: Float): js.Array[Float] = js.native
  override def updateContainerSize(containerSize: js.Array[Float]): Unit = js.native
  override def getIndices(xOffsets: js.Array[Float], yOffsets: js.Array[Float],
                          count: Int, containerSize: js.Array[Float]): js.Array[Float] = js.native
  override def getElementPosition(index: Int): js.Array[Float] = js.native
  override def configureElement(element: dom.Element, index: Int): Unit = js.native
  override def convertPositionInSize(position: js.Array[Float], newContainerSize: js.Array[Float],
                                     oldLayout: Layout): js.Array[Float] = js.native

  var insets: js.Array[js.Array[Float]] = js.native
  var itemSize: js.Array[Float] = js.native
}
