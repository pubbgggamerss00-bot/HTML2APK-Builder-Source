package androidx.camera.core.internal;

import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ReadableConfig;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public interface ThreadConfig extends ReadableConfig {
    public static final Config.Option<Executor> OPTION_BACKGROUND_EXECUTOR = Config.Option.create("camerax.core.thread.backgroundExecutor", Executor.class);

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface Builder<B> {
        B setBackgroundExecutor(Executor executor);
    }

    default Executor getBackgroundExecutor(Executor executor) {
        return (Executor) retrieveOption(OPTION_BACKGROUND_EXECUTOR, executor);
    }

    default Executor getBackgroundExecutor() {
        return (Executor) retrieveOption(OPTION_BACKGROUND_EXECUTOR);
    }
}
