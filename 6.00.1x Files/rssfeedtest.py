# -*- coding: utf-8 -*-
"""
Created on Sun Jul 26 19:00:04 2015

@author: User
"""

import feedparser
 
python_wiki_rss_url = "http://www.python.org/cgi-bin/moinmoin/" \
                      "RecentChanges?action=rss_rc"
feed = feedparser.parse( python_wiki_rss_url )

import feedparser
 
python_wiki_rss_url = "http://www.python.org/cgi-bin/moinmoin/" \
                    "RecentChanges?action=rss_rc"
                    
feed = feedparser.parse( python_wiki_rss_url )