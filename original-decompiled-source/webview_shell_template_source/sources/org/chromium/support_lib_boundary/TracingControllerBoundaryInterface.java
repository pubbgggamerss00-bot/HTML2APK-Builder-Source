package org.chromium.support_lib_boundary;

import java.io.OutputStream;
import java.util.Collection;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public interface TracingControllerBoundaryInterface {
    boolean isTracing();

    void start(int i6, Collection<String> collection, int i7);

    boolean stop(OutputStream outputStream, Executor executor);
}
