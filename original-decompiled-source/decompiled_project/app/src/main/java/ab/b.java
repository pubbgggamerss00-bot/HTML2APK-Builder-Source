package ab;

import android.os.Looper;
import android.util.Log;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static ClassLoader f390a;

    /* renamed from: b, reason: collision with root package name */
    public static Thread f391b;

    /* JADX WARN: Removed duplicated region for block: B:53:0x00ab A[Catch: all -> 0x00a7, PHI: r1
      0x00ab: PHI (r1v4 java.lang.Thread) = (r1v3 java.lang.Thread), (r1v15 java.lang.Thread) binds: [B:7:0x000a, B:47:0x00a4] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #4 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000c, B:46:0x00a2, B:61:0x00d1, B:12:0x001f, B:52:0x00aa, B:53:0x00ab, B:64:0x00d5, B:65:0x00d6, B:54:0x00ac, B:60:0x00d0, B:59:0x00b6, B:13:0x0020, B:15:0x002d, B:25:0x0047, B:26:0x004e, B:28:0x0059, B:34:0x006e, B:35:0x0075, B:43:0x0086, B:44:0x00a0, B:18:0x003c), top: B:77:0x0003, inners: #2, #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized ClassLoader a() {
        SecurityException e10;
        Thread thread;
        ThreadGroup threadGroup;
        a aVar;
        if (f390a == null) {
            Thread thread2 = f391b;
            ClassLoader contextClassLoader = null;
            if (thread2 != null) {
                synchronized (thread2) {
                    try {
                        contextClassLoader = f391b.getContextClassLoader();
                    } catch (SecurityException e11) {
                        Log.w("DynamiteLoaderV2CL", "Failed to get thread context classloader " + e11.getMessage());
                    }
                }
                f390a = contextClassLoader;
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
                                int i10 = 0;
                                int i11 = 0;
                                while (true) {
                                    if (i11 >= iActiveGroupCount) {
                                        threadGroup = null;
                                        break;
                                    }
                                    threadGroup = threadGroupArr[i11];
                                    if ("dynamiteLoader".equals(threadGroup.getName())) {
                                        break;
                                    }
                                    i11++;
                                }
                                if (threadGroup == null) {
                                    threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                                }
                                int iActiveCount = threadGroup.activeCount();
                                Thread[] threadArr = new Thread[iActiveCount];
                                threadGroup.enumerate(threadArr);
                                while (true) {
                                    if (i10 >= iActiveCount) {
                                        thread = null;
                                        break;
                                    }
                                    thread = threadArr[i10];
                                    if ("GmsDynamite".equals(thread.getName())) {
                                        break;
                                    }
                                    i10++;
                                }
                                if (thread == null) {
                                    try {
                                        aVar = new a(threadGroup, "GmsDynamite");
                                    } catch (SecurityException e12) {
                                        e10 = e12;
                                    }
                                    try {
                                        aVar.setContextClassLoader(null);
                                        aVar.start();
                                        thread = aVar;
                                    } catch (SecurityException e13) {
                                        e10 = e13;
                                        thread = aVar;
                                        Log.w("DynamiteLoaderV2CL", "Failed to enumerate thread/threadgroup " + e10.getMessage());
                                        thread2 = thread;
                                        f391b = thread2;
                                        if (thread2 != null) {
                                        }
                                        f390a = contextClassLoader;
                                        return f390a;
                                    }
                                }
                            } catch (SecurityException e14) {
                                e10 = e14;
                                thread = null;
                            }
                        } finally {
                        }
                    }
                    thread2 = thread;
                }
                f391b = thread2;
                if (thread2 != null) {
                }
                f390a = contextClassLoader;
            }
        }
        return f390a;
    }
}
