package com.botech.designpattern.command.command;

import com.botech.designpattern.command.command.bean.Request;
import com.botech.designpattern.command.command.impl.ArchiveCommand;
import com.botech.designpattern.command.command.impl.GotDiamondCommand;
import com.botech.designpattern.command.command.impl.GotStartCommand;
import com.botech.designpattern.command.command.impl.HitObstacleCommand;
import com.botech.designpattern.command.command.status.Event;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 游戏应用程序
 *
 * @author wangjubin
 * @date 2023/06/26
 */
public class GameApplication {
    private static final int MAX_HANDLED_REQ_COUNT_PER_LOOP = 100;
    private Queue<Command> queue = new LinkedList<>();

    public void mainLoop() {
        while (true) {
            List<Request> requests = new ArrayList<>();
            //省略从epoll或者select中获取数据，并封装成Request的逻辑，
            //注意设置超时时间，如果很长时间没有接收到请求，就继续下面的逻辑处理。
            for (Request request : requests) {
                Event event = request.getEvent();
                Command command = null;
                switch (event) {
                    case GOT_DIAMOND:
                        command = new GotDiamondCommand(/*数据*/);
                        break;
                    case GOT_STAR:
                        command = new GotStartCommand(/*数据*/);
                        break;
                    case HIT_OBSTACLE:
                        command = new HitObstacleCommand(/*数据*/);
                        break;
                    case ARCHIVE:
                        command = new ArchiveCommand(/*数据*/);
                        break;
                    //...一堆case
                }
                queue.add(command);
            }
            int handledCount = 0;
            while (handledCount < MAX_HANDLED_REQ_COUNT_PER_LOOP) {
                if (queue.isEmpty()) {
                    break;
                }
                Command command = queue.poll();
                command.execute();
                handledCount++;
            }
            
        }
    }
}