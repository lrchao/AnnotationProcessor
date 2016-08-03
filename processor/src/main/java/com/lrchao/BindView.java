package com.lrchao;

import android.support.annotation.IdRes;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.CLASS;
/**
 * Description: TODO
 *
 * @author liuranchao
 * @date 16/8/2 下午5:34
 */
@Retention(CLASS) @Target(FIELD)
public @interface BindView {

    /** View ID to which the field will be bound. */
    @IdRes int value();
}
