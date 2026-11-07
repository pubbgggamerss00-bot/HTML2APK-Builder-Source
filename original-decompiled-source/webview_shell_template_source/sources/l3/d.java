package l3;

import android.os.Looper;
import android.util.Log;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static ClassLoader f13843a;

    /* renamed from: b, reason: collision with root package name */
    public static Thread f13844b;

    /* JADX WARN: Removed duplicated region for block: B:53:0x00b7 A[Catch: all -> 0x00b3, PHI: r2
      0x00b7: PHI (r2v1 java.lang.Thread) = (r2v0 java.lang.Thread), (r2v11 java.lang.Thread) binds: [B:7:0x000c, B:47:0x00b0] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000e, B:46:0x00ae, B:61:0x00e5, B:12:0x0023, B:52:0x00b6, B:53:0x00b7, B:64:0x00e9, B:65:0x00ea, B:13:0x0024, B:15:0x0031, B:25:0x004b, B:26:0x0052, B:28:0x005d, B:34:0x0072, B:35:0x0079, B:43:0x008a, B:44:0x00ac, B:18:0x0040, B:54:0x00b8, B:60:0x00e4, B:59:0x00c2), top: B:76:0x0003, inners: #2, #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized ClassLoader a() {
        SecurityException e6;
        Thread thread;
        ThreadGroup threadGroup;
        if (f13843a == null) {
            Thread thread2 = f13844b;
            ClassLoader contextClassLoader = null;
            if (thread2 != null) {
                synchronized (thread2) {
                    try {
                        contextClassLoader = f13844b.getContextClassLoader();
                    } catch (SecurityException e7) {
                        String message = e7.getMessage();
                        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 41);
                        sb.append("Failed to get thread context classloader ");
                        sb.append(message);
                        Log.w("DynamiteLoaderV2CL", sb.toString());
                    }
                }
                f13843a = contextClassLoader;
            } else {
                ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
                if (threadGroup2 == null) {
                    thread2 = null;
                } else {
                    synchronized (Void.class) {
                        try {
                            try {
                                int iActiveGroupCount = threadGroup2.activeGroupCount();
                                ThreadGroup[] threadGroupArr = new ThreadGroup[iActiveGroupCount];
                                threadGroup2.enumerate(threadGroupArr);
                                int i6 = 0;
                                int i7 = 0;
                                while (true) {
                                    if (i7 >= iActiveGroupCount) {
                                        threadGroup = null;
                                        break;
                                    }
                                    threadGroup = threadGroupArr[i7];
                                    if ("dynamiteLoader".equals(threadGroup.getName())) {
                                        break;
                                    }
                                    i7++;
                                }
                                if (threadGroup == null) {
                                    threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                                }
                                int iActiveCount = threadGroup.activeCount();
                                Thread[] threadArr = new Thread[iActiveCount];
                                threadGroup.enumerate(threadArr);
                                while (true) {
                                    if (i6 >= iActiveCount) {
                                        thread = null;
                                        break;
                                    }
                                    thread = threadArr[i6];
                                    if ("GmsDynamite".equals(thread.getName())) {
                                        break;
                                    }
                                    i6++;
                                }
                                if (thread == null) {
                                    try {
                                        c cVar = new c(threadGroup, "GmsDynamite");
                                        try {
                                            cVar.setContextClassLoader(null);
                                            cVar.start();
                                            thread = cVar;
                                        } catch (SecurityException e8) {
                                            e6 = e8;
                                            thread = cVar;
                                            String message2 = e6.getMessage();
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(message2).length() + 39);
                                            sb2.append("Failed to enumerate thread/threadgroup ");
                                            sb2.append(message2);
                                            Log.w("DynamiteLoaderV2CL", sb2.toString());
                                            thread2 = thread;
                                            f13844b = thread2;
                                            if (thread2 != null) {
                                            }
                                            f13843a = contextClassLoader;
                                            return f13843a;
                                        }
                                    } catch (SecurityException e9) {
                                        e6 = e9;
                                    }
                                }
                            } finally {
                            }
                        } catch (SecurityException e10) {
                            e6 = e10;
                            thread = null;
                        }
                    }
                    thread2 = thread;
                }
                f13844b = thread2;
                if (thread2 != null) {
                }
                f13843a = contextClassLoader;
            }
        }
        return f13843a;
    }
}
