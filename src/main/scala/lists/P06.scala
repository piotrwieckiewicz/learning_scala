package lists

import lists.P05.reverse

object P06 {

  def isPalindrome[A](list: List[A]): Boolean = {
    if reverse(list) == list then true
    else false
  }

}
