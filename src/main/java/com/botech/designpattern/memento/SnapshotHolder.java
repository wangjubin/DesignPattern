package com.botech.designpattern.memento;

import java.util.Stack;

/**
 * 快照持有人
 *
 * @author wangjubin
 * @date 2023/06/26
 */
public class SnapshotHolder{
    private Stack<Snapshot> snapshots = new Stack<>();
    public Snapshot popSnapshot(){
        return snapshots.pop();
    }
    public void pushSnapshot(Snapshot snapshot){
        snapshots.push(snapshot);
    }
}