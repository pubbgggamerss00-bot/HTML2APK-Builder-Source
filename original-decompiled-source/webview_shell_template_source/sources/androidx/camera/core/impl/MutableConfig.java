package androidx.camera.core.impl;

import androidx.camera.core.impl.Config;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public interface MutableConfig extends Config {
    <ValueT> void insertOption(Config.Option<ValueT> option, Config.OptionPriority optionPriority, ValueT valuet);

    <ValueT> void insertOption(Config.Option<ValueT> option, ValueT valuet);

    <ValueT> ValueT removeOption(Config.Option<ValueT> option);
}
