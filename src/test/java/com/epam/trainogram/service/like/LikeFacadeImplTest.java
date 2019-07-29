package com.epam.trainogram.service.like;

import com.epam.trainogram.service.notification.NotificationServiceImpl;

class LikeFacadeImplTest {
  LikeFacade likeFacade = new LikeFacadeImpl(
      new LikeServiceImpl(
          new LikeDaoImpl()
      ),
      new NotificationServiceImpl()
  );
}
