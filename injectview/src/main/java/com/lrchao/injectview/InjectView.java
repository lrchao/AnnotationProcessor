package com.lrchao.injectview;

import android.app.Activity;

/**
 * Description: TODO
 *
 * @author liuranchao
 * @date 16/8/4 下午6:07
 */
public class InjectView {

    public static void bind(Activity activity){
        String clsName = activity.getClass().getName();
        try {
            Class<?> viewBindingClass = Class.forName(clsName + "$$ViewBinder");
            ViewBinder viewBinder = (ViewBinder)viewBindingClass.newInstance();
            viewBinder.bind(activity);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
