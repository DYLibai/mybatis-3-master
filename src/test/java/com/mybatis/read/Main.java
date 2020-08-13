package com.mybatis.read;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Author sunxy
 * @Create 2019-12-25 15:29
 **/
public class Main {


    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) throws IOException {

        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        long start = System.currentTimeMillis();
        int[] ints = twoSum(nums, target);
        long end = System.currentTimeMillis();
        System.out.println((end-start));
        System.out.println(ints);
        // 获取配置文件
/*        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        // 构建SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            User user = sqlSession.selectOne("com.mybatis.read.UserDao.selectUser", 1);
          System.out.println(user);
        } finally {
            sqlSession.close();
        }*/
    }
}
