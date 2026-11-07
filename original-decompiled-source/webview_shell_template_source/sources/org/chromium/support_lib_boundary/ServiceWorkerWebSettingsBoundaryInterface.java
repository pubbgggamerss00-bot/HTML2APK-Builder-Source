package org.chromium.support_lib_boundary;

import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public interface ServiceWorkerWebSettingsBoundaryInterface {
    boolean getAllowContentAccess();

    boolean getAllowFileAccess();

    boolean getBlockNetworkLoads();

    int getCacheMode();

    Set<String> getRequestedWithHeaderOriginAllowList();

    void setAllowContentAccess(boolean z6);

    void setAllowFileAccess(boolean z6);

    void setBlockNetworkLoads(boolean z6);

    void setCacheMode(int i6);

    void setRequestedWithHeaderOriginAllowList(Set<String> set);
}
