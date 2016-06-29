package com.turbolent.collectionView

import org.scalajs.dom

import scala.scalajs.js


@js.native
trait Layout extends js.Object {
  def getContentSize(count: Int, containerSize: Float): js.Array[Float]
  def updateContainerSize(containerSize: js.Array[Float]): Unit
  def getIndices(xOffsets: js.Array[Float], yOffsets: js.Array[Float],
                 count: Int, containerSize: js.Array[Float]): js.Array[Float]
  def getElementPosition(index: Int): js.Array[Float]
  def configureElement(element: dom.Element, index: Int): Unit
  def convertPositionInSize(position: js.Array[Float], newContainerSize: js.Array[Float],
                            oldLayout: Layout): js.Array[Float]
}
