# Observer

Observer is a pattern that is also known as the Subscribe-Publisher pattern. Classes subscribe to a certain Observable,
and the Observable notifies these classes (from now on known as Observers) of any events that happen. Auctions are a
good example, but an RSS feed is one as well. A well-known case is Twitter, where users get updates of the people they
follow.

The benefits of this pattern are that a user does not have to spend time performing queries for updates. There's a lot
of decoupling because the Observable does not really know the Observes (it just has a list that it sends the same
updates to). It's used, as it was said before, for subscriptions.

Please keep in mind that this implementation is subject to change, and I might just change the whole project for an
example that I feel fits this description better. The code smells badly, too.
