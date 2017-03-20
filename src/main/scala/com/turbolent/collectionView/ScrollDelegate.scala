package com.turbolent.collectionView

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined


@ScalaJSDefined
trait ScrollDelegate extends js.Object {
  def onScroll(view: CollectionView)
}
