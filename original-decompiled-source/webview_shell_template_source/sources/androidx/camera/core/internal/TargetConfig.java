package androidx.camera.core.internal;

import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ReadableConfig;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public interface TargetConfig<T> extends ReadableConfig {
    public static final Config.Option<String> OPTION_TARGET_NAME = Config.Option.create("camerax.core.target.name", String.class);
    public static final Config.Option<Class<?>> OPTION_TARGET_CLASS = Config.Option.create("camerax.core.target.class", Class.class);

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface Builder<T, B> {
        B setTargetClass(Class<T> cls);

        B setTargetName(String str);
    }

    default Class<T> getTargetClass(Class<T> cls) {
        return (Class) retrieveOption(OPTION_TARGET_CLASS, cls);
    }

    default String getTargetName(String str) {
        return (String) retrieveOption(OPTION_TARGET_NAME, str);
    }

    default Class<T> getTargetClass() {
        return (Class) retrieveOption(OPTION_TARGET_CLASS);
    }

    default String getTargetName() {
        return (String) retrieveOption(OPTION_TARGET_NAME);
    }
}
