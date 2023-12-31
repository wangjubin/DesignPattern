package com.botech.designpattern.prototype;

import cn.hutool.core.collection.ListUtil;

import java.util.HashMap;
import java.util.List;

/**
 * <p>
 * 我们可以先采用浅拷贝的方式创建 newKeywords。
 * 对于需要更新的 SearchWord 对象，
 * 我们再使用深度拷贝的方式创建一份新的对象，替换 newKeywords 中的老对象
 * </p>
 *
 * @author wangjubin
 * @date 2023/06/19
 */
public class Demo {
    private HashMap<String, SearchWord> currentKeywords = new HashMap<>();
    private long lastUpdateTime = -1;

    public void refresh() {
        //浅拷贝
        HashMap<String, SearchWord> newKeywords = (HashMap<String, SearchWord>) currentKeywords.clone();
        //从数据库中取出更新时间>lastUpdateTime的数据，放入到newKeywords中
        List<SearchWord> toBeUpdatedSearchWords = getSearchWords(lastUpdateTime);
        long maxNewUpdatedTime = lastUpdateTime;
        for (SearchWord searchWord : toBeUpdatedSearchWords) {
            if (searchWord.getLastUpdateTime() > maxNewUpdatedTime) {
                maxNewUpdatedTime = searchWord.getLastUpdateTime();
            }
            if (newKeywords.containsKey(searchWord.getKeyword())) {
                newKeywords.remove(searchWord.getKeyword(), searchWord);
            }
            newKeywords.put(searchWord.getKeyword(), searchWord);
        }
        lastUpdateTime = maxNewUpdatedTime;
        currentKeywords = newKeywords;
    }

    private List<SearchWord> getSearchWords(long lastUpdateTime) {
        // TODO: 从数据库中取出更新时间>lastUpdateTime的数据
        return ListUtil.empty();
    }
}