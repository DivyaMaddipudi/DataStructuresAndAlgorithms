class Twitter {

    class Tweets {
        int tweetId;
        int createdAt;
        public Tweets(int tweetId, int createdAt) {
            this.tweetId = tweetId;
            this.createdAt = createdAt;
        }
    }
    
    HashMap<Integer, Set<Integer>> hm;
    HashMap<Integer,  List<Tweets>> allTweets;
    int idx;
    public Twitter() {
        hm = new HashMap<>();
        allTweets =new HashMap<>();
    }
    
    public void postTweet(int userId, int tweetId) {
        idx++;
        Tweets tweet = new Tweets(tweetId, idx);
        if(allTweets.containsKey(userId)) {
            List<Tweets> allFollowedTweets = allTweets.get(userId);
            allFollowedTweets.add(tweet);
            return;
        }
        
        List<Tweets> allFollowedTweets = new ArrayList<>();
        allFollowedTweets.add(tweet);
        allTweets.put(userId, allFollowedTweets);
    }
    
    public List<Integer> getNewsFeed(int userId) {
        if(hm.containsKey(userId)) {
            hm.get(userId).add(userId);
        } else {
            HashSet<Integer> set =  new HashSet<>();
            set.add(userId);
            hm.put(userId, set);
        }
        
        PriorityQueue<Tweets> pq = new PriorityQueue<>((t1, t2) -> t1.createdAt - t2.createdAt);
        ArrayList<Integer> result = new ArrayList<>();
        for(int user : hm.get(userId)) {
            if(allTweets.get(user) == null) continue;
            for(Tweets tweet : allTweets.get(user)) {
                pq.add(tweet);
                if(pq.size() > 10) {
                    pq.poll();
                }
            }
        }
        while(!pq.isEmpty()) {
            // System.out.println(pq.poll().createdAt + " in get tweet from pq");
            result.add(0, pq.poll().tweetId);
        }
        return result;
    }
    
    public void follow(int followerId, int followeeId) {
        if(hm.containsKey(followerId)) {
            Set<Integer> set = hm.get(followerId);
            set.add(followeeId);
            return;
        }
        Set<Integer> set = new HashSet<>();
        set.add(followeeId);
        hm.put(followerId, set);
    }
    
    public void unfollow(int followerId, int followeeId) {
         if(hm.containsKey(followerId)) {
            Set<Integer> set = hm.get(followerId);
            if(!set.contains(followeeId)) {
                return;
            } 
            set.remove(followeeId);
        }
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */