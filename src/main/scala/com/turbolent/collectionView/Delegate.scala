package com.turbolent.collectionView

import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined


@ScalaJSDefined
trait Delegate extends js.Object {
  def getCount(): Int
  def configureElement(element: dom.Element, index: Int)
}

@ScalaJSDefined
trait ScrollDelegate extends js.Object {
  def onScroll(view: CollectionView)
}
