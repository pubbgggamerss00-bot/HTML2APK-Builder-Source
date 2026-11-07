package okhttp3.internal.platform.android;

import android.util.Log;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import kotlin.jvm.internal.r;
import mh.x;
import mh.y;

/* loaded from: classes2.dex */
public final class AndroidLogHandler extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public static final AndroidLogHandler f19778a = new AndroidLogHandler();

    private AndroidLogHandler() {
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }

    @Override // java.util.logging.Handler
    public final void publish(LogRecord record) {
        int iMin;
        r.e(record, "record");
        AndroidLog androidLog = AndroidLog.f19775a;
        String loggerName = record.getLoggerName();
        r.d(loggerName, "record.loggerName");
        int iIntValue = record.getLevel().intValue();
        Level level = Level.INFO;
        int i10 = iIntValue > level.intValue() ? 5 : record.getLevel().intValue() == level.intValue() ? 4 : 3;
        String message = record.getMessage();
        r.d(message, "record.message");
        Throwable thrown = record.getThrown();
        androidLog.getClass();
        String strB0 = AndroidLog.f19777c.get(loggerName);
        if (strB0 == null) {
            strB0 = y.b0(23, loggerName);
        }
        if (Log.isLoggable(strB0, i10)) {
            if (thrown != null) {
                message = message + '\n' + Log.getStackTraceString(thrown);
            }
            int length = message.length();
            int i11 = 0;
            while (i11 < length) {
                int iX = x.x(message, '\n', i11, 4);
                if (iX == -1) {
                    iX = length;
                }
                while (true) {
                    iMin = Math.min(iX, i11 + 4000);
                    String strSubstring = message.substring(i11, iMin);
                    r.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i10, strB0, strSubstring);
                    if (iMin >= iX) {
                        break;
                    } else {
                        i11 = iMin;
                    }
                }
                i11 = iMin + 1;
            }
        }
    }
}
