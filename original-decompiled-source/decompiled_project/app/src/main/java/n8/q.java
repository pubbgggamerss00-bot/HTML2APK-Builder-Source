package n8;

import android.net.Uri;
import android.util.Log;
import com.basitce.htmltoapk.data.apkgenerator.signer.KeystoreHelper;
import com.basitce.htmltoapk.data.apkgenerator.signer.KeystorePasswordStorage;
import com.basitce.htmltoapk.data.apkgenerator.signer.KeystoreStorage;
import com.basitce.htmltoapk.data.local.entity.KeystoreEntity;
import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import com.basitce.htmltoapk.domain.model.ProjectKind;
import f9.fg;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import org.bouncycastle.asn1.BERTags;
import org.jf.dexlib2.dexbacked.raw.HeaderItem;

@vg.e(c = "com.basitce.htmltoapk.data.repository.KeystoreRepository$syncAndMigrateLegacyProjectKeystores$2", f = "KeystoreRepository.kt", l = {BERTags.FLAGS, HeaderItem.METHOD_COUNT_OFFSET, 89, 114, 138, 150, 154, 160, 167, 184, 187}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class q extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public yh.a f18562a;

    /* renamed from: b, reason: collision with root package name */
    public Object f18563b;

    /* renamed from: c, reason: collision with root package name */
    public Object f18564c;

    /* renamed from: d, reason: collision with root package name */
    public Object f18565d;

    /* renamed from: e, reason: collision with root package name */
    public Object f18566e;

    /* renamed from: f, reason: collision with root package name */
    public Object f18567f;

    /* renamed from: g, reason: collision with root package name */
    public Object f18568g;

    /* renamed from: h, reason: collision with root package name */
    public Object f18569h;

    /* renamed from: j, reason: collision with root package name */
    public Object f18570j;

    /* renamed from: k, reason: collision with root package name */
    public KeystoreEntity f18571k;

    /* renamed from: l, reason: collision with root package name */
    public long f18572l;

    /* renamed from: m, reason: collision with root package name */
    public int f18573m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l f18574n;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ s f18575p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(l lVar, s sVar, tg.e<? super q> eVar) {
        super(2, eVar);
        this.f18574n = lVar;
        this.f18575p = sVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new q(this.f18574n, this.f18575p, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((q) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:327|193|359|194|195|323|196|197|315|198) */
    /* JADX WARN: Can't wrap try/catch for region: R(11:192|327|193|359|194|195|323|196|197|315|198) */
    /* JADX WARN: Can't wrap try/catch for region: R(17:106|(3:307|107|(3:357|109|(1:382)(1:383))(2:381|114))|115|(15:119|(1:121)|(0)|124|319|126|(1:128)|129|(4:355|131|(0)|150)|135|136|333|137|(2:139|(3:142|143|144))|150)|125|124|319|126|(0)|129|(0)|135|136|333|137|(0)|150) */
    /* JADX WARN: Can't wrap try/catch for region: R(31:26|317|27|28|202|(1:349)|207|208|329|209|210|351|211|212|339|213|214|341|215|(1:217)|218|347|219|220|353|221|(3:223|(4:226|227|82|(0)(0))|276)|228|82|(0)(0)|276) */
    /* JADX WARN: Can't wrap try/catch for region: R(31:26|317|27|28|202|349|207|208|329|209|210|351|211|212|339|213|214|341|215|(1:217)|218|347|219|220|353|221|(3:223|(4:226|227|82|(0)(0))|276)|228|82|(0)(0)|276) */
    /* JADX WARN: Can't wrap try/catch for region: R(5:270|271|309|272|(2:274|(4:277|278|376|(1:257)))(3:279|376|(1:257))) */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0428, code lost:
    
        r13 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x042a, code lost:
    
        r20 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0728, code lost:
    
        if (r14.c(r6, r106) != r2) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0735, code lost:
    
        r24 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x073c, code lost:
    
        r24 = r0;
        r11 = r7;
        r7 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x07c9, code lost:
    
        r18 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x07cc, code lost:
    
        r23 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x07cf, code lost:
    
        r10 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x07d2, code lost:
    
        r23 = r6;
        r18 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x07d6, code lost:
    
        r10 = r20;
        r8 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x07db, code lost:
    
        r23 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x0970, code lost:
    
        r3 = r6;
        r6 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 15, insn: 0x0186: MOVE (r7 I:??[OBJECT, ARRAY]) = (r15 I:??[OBJECT, ARRAY]), block:B:38:0x0186 */
    /* JADX WARN: Path cross not found for [B:125:0x03a5, B:119:0x0395], limit reached: 382 */
    /* JADX WARN: Path cross not found for [B:166:0x048c, B:180:0x04cc], limit reached: 382 */
    /* JADX WARN: Path cross not found for [B:311:0x034a, B:149:0x0433], limit reached: 382 */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03e1 A[Catch: all -> 0x00a3, Exception -> 0x0428, TRY_LEAVE, TryCatch #4 {all -> 0x00a3, blocks: (B:21:0x0090, B:82:0x02dc, B:84:0x02e2, B:86:0x02f4, B:88:0x02fe, B:90:0x0304, B:92:0x030a, B:95:0x0314, B:98:0x0327, B:100:0x032d, B:102:0x033c, B:104:0x034a, B:106:0x0359, B:107:0x0365, B:109:0x036f, B:115:0x0387, B:117:0x038b, B:119:0x0395, B:121:0x039b, B:126:0x03a8, B:129:0x03c2, B:131:0x03c8, B:135:0x03d3, B:137:0x03d7, B:139:0x03e1, B:152:0x0440, B:153:0x0458, B:155:0x0461, B:159:0x0470, B:162:0x0476, B:164:0x0480, B:166:0x048c, B:167:0x0498, B:169:0x04a2, B:173:0x04b3, B:175:0x04b7, B:177:0x04c1, B:181:0x04cd, B:183:0x04dd, B:184:0x04f5, B:186:0x0521, B:189:0x05dc, B:196:0x071d, B:198:0x0722, B:207:0x0742, B:209:0x0748, B:211:0x074d, B:213:0x0756, B:215:0x075c, B:219:0x0769, B:221:0x076d, B:223:0x0777, B:236:0x07e1, B:238:0x07f6, B:240:0x07fc, B:66:0x024c, B:69:0x025f, B:70:0x0268, B:72:0x026e, B:74:0x028d, B:77:0x02a0, B:78:0x02a9, B:80:0x02af, B:81:0x02cb, B:62:0x022d, B:59:0x0218), top: B:313:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0765  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0777 A[Catch: all -> 0x00a3, Exception -> 0x07c0, TRY_LEAVE, TryCatch #4 {all -> 0x00a3, blocks: (B:21:0x0090, B:82:0x02dc, B:84:0x02e2, B:86:0x02f4, B:88:0x02fe, B:90:0x0304, B:92:0x030a, B:95:0x0314, B:98:0x0327, B:100:0x032d, B:102:0x033c, B:104:0x034a, B:106:0x0359, B:107:0x0365, B:109:0x036f, B:115:0x0387, B:117:0x038b, B:119:0x0395, B:121:0x039b, B:126:0x03a8, B:129:0x03c2, B:131:0x03c8, B:135:0x03d3, B:137:0x03d7, B:139:0x03e1, B:152:0x0440, B:153:0x0458, B:155:0x0461, B:159:0x0470, B:162:0x0476, B:164:0x0480, B:166:0x048c, B:167:0x0498, B:169:0x04a2, B:173:0x04b3, B:175:0x04b7, B:177:0x04c1, B:181:0x04cd, B:183:0x04dd, B:184:0x04f5, B:186:0x0521, B:189:0x05dc, B:196:0x071d, B:198:0x0722, B:207:0x0742, B:209:0x0748, B:211:0x074d, B:213:0x0756, B:215:0x075c, B:219:0x0769, B:221:0x076d, B:223:0x0777, B:236:0x07e1, B:238:0x07f6, B:240:0x07fc, B:66:0x024c, B:69:0x025f, B:70:0x0268, B:72:0x026e, B:74:0x028d, B:77:0x02a0, B:78:0x02a9, B:80:0x02af, B:81:0x02cb, B:62:0x022d, B:59:0x0218), top: B:313:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0839 A[Catch: all -> 0x0036, Exception -> 0x0077, LOOP:1: B:245:0x0833->B:247:0x0839, LOOP_END, TryCatch #9 {Exception -> 0x0077, blocks: (B:257:0x0875, B:259:0x087b, B:261:0x088e, B:263:0x0898, B:265:0x08ae, B:267:0x08c0, B:271:0x0915, B:281:0x097e, B:17:0x0070, B:244:0x0822, B:245:0x0833, B:247:0x0839, B:248:0x0850, B:250:0x085a, B:252:0x0863, B:254:0x086b, B:255:0x086e, B:256:0x0871), top: B:321:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x085a A[Catch: all -> 0x0036, Exception -> 0x0077, TryCatch #9 {Exception -> 0x0077, blocks: (B:257:0x0875, B:259:0x087b, B:261:0x088e, B:263:0x0898, B:265:0x08ae, B:267:0x08c0, B:271:0x0915, B:281:0x097e, B:17:0x0070, B:244:0x0822, B:245:0x0833, B:247:0x0839, B:248:0x0850, B:250:0x085a, B:252:0x0863, B:254:0x086b, B:255:0x086e, B:256:0x0871), top: B:321:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x087b A[Catch: all -> 0x0036, Exception -> 0x0077, TryCatch #9 {Exception -> 0x0077, blocks: (B:257:0x0875, B:259:0x087b, B:261:0x088e, B:263:0x0898, B:265:0x08ae, B:267:0x08c0, B:271:0x0915, B:281:0x097e, B:17:0x0070, B:244:0x0822, B:245:0x0833, B:247:0x0839, B:248:0x0850, B:250:0x085a, B:252:0x0863, B:254:0x086b, B:255:0x086e, B:256:0x0871), top: B:321:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0938 A[Catch: all -> 0x0036, Exception -> 0x096e, TRY_LEAVE, TryCatch #2 {Exception -> 0x096e, blocks: (B:272:0x091b, B:274:0x0938), top: B:309:0x091b }] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0977  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x03c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x07e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x022d A[Catch: all -> 0x00a3, Exception -> 0x028a, PHI: r3 r11 r12 r13
      0x022d: PHI (r3v5 n8.l) = (r3v2 n8.l), (r3v8 n8.l) binds: [B:60:0x0229, B:51:0x01dc] A[DONT_GENERATE, DONT_INLINE]
      0x022d: PHI (r11v6 yh.a) = (r11v2 yh.a), (r11v9 yh.a) binds: [B:60:0x0229, B:51:0x01dc] A[DONT_GENERATE, DONT_INLINE]
      0x022d: PHI (r12v4 n8.s) = (r12v1 n8.s), (r12v7 n8.s) binds: [B:60:0x0229, B:51:0x01dc] A[DONT_GENERATE, DONT_INLINE]
      0x022d: PHI (r13v4 java.lang.Object) = (r13v3 java.lang.Object), (r13v8 java.lang.Object) binds: [B:60:0x0229, B:51:0x01dc] A[DONT_GENERATE, DONT_INLINE], TryCatch #4 {all -> 0x00a3, blocks: (B:21:0x0090, B:82:0x02dc, B:84:0x02e2, B:86:0x02f4, B:88:0x02fe, B:90:0x0304, B:92:0x030a, B:95:0x0314, B:98:0x0327, B:100:0x032d, B:102:0x033c, B:104:0x034a, B:106:0x0359, B:107:0x0365, B:109:0x036f, B:115:0x0387, B:117:0x038b, B:119:0x0395, B:121:0x039b, B:126:0x03a8, B:129:0x03c2, B:131:0x03c8, B:135:0x03d3, B:137:0x03d7, B:139:0x03e1, B:152:0x0440, B:153:0x0458, B:155:0x0461, B:159:0x0470, B:162:0x0476, B:164:0x0480, B:166:0x048c, B:167:0x0498, B:169:0x04a2, B:173:0x04b3, B:175:0x04b7, B:177:0x04c1, B:181:0x04cd, B:183:0x04dd, B:184:0x04f5, B:186:0x0521, B:189:0x05dc, B:196:0x071d, B:198:0x0722, B:207:0x0742, B:209:0x0748, B:211:0x074d, B:213:0x0756, B:215:0x075c, B:219:0x0769, B:221:0x076d, B:223:0x0777, B:236:0x07e1, B:238:0x07f6, B:240:0x07fc, B:66:0x024c, B:69:0x025f, B:70:0x0268, B:72:0x026e, B:74:0x028d, B:77:0x02a0, B:78:0x02a9, B:80:0x02af, B:81:0x02cb, B:62:0x022d, B:59:0x0218), top: B:313:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x026e A[Catch: all -> 0x00a3, Exception -> 0x028a, LOOP:6: B:70:0x0268->B:72:0x026e, LOOP_END, TryCatch #4 {all -> 0x00a3, blocks: (B:21:0x0090, B:82:0x02dc, B:84:0x02e2, B:86:0x02f4, B:88:0x02fe, B:90:0x0304, B:92:0x030a, B:95:0x0314, B:98:0x0327, B:100:0x032d, B:102:0x033c, B:104:0x034a, B:106:0x0359, B:107:0x0365, B:109:0x036f, B:115:0x0387, B:117:0x038b, B:119:0x0395, B:121:0x039b, B:126:0x03a8, B:129:0x03c2, B:131:0x03c8, B:135:0x03d3, B:137:0x03d7, B:139:0x03e1, B:152:0x0440, B:153:0x0458, B:155:0x0461, B:159:0x0470, B:162:0x0476, B:164:0x0480, B:166:0x048c, B:167:0x0498, B:169:0x04a2, B:173:0x04b3, B:175:0x04b7, B:177:0x04c1, B:181:0x04cd, B:183:0x04dd, B:184:0x04f5, B:186:0x0521, B:189:0x05dc, B:196:0x071d, B:198:0x0722, B:207:0x0742, B:209:0x0748, B:211:0x074d, B:213:0x0756, B:215:0x075c, B:219:0x0769, B:221:0x076d, B:223:0x0777, B:236:0x07e1, B:238:0x07f6, B:240:0x07fc, B:66:0x024c, B:69:0x025f, B:70:0x0268, B:72:0x026e, B:74:0x028d, B:77:0x02a0, B:78:0x02a9, B:80:0x02af, B:81:0x02cb, B:62:0x022d, B:59:0x0218), top: B:313:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02af A[Catch: all -> 0x00a3, Exception -> 0x028a, LOOP:7: B:78:0x02a9->B:80:0x02af, LOOP_END, TryCatch #4 {all -> 0x00a3, blocks: (B:21:0x0090, B:82:0x02dc, B:84:0x02e2, B:86:0x02f4, B:88:0x02fe, B:90:0x0304, B:92:0x030a, B:95:0x0314, B:98:0x0327, B:100:0x032d, B:102:0x033c, B:104:0x034a, B:106:0x0359, B:107:0x0365, B:109:0x036f, B:115:0x0387, B:117:0x038b, B:119:0x0395, B:121:0x039b, B:126:0x03a8, B:129:0x03c2, B:131:0x03c8, B:135:0x03d3, B:137:0x03d7, B:139:0x03e1, B:152:0x0440, B:153:0x0458, B:155:0x0461, B:159:0x0470, B:162:0x0476, B:164:0x0480, B:166:0x048c, B:167:0x0498, B:169:0x04a2, B:173:0x04b3, B:175:0x04b7, B:177:0x04c1, B:181:0x04cd, B:183:0x04dd, B:184:0x04f5, B:186:0x0521, B:189:0x05dc, B:196:0x071d, B:198:0x0722, B:207:0x0742, B:209:0x0748, B:211:0x074d, B:213:0x0756, B:215:0x075c, B:219:0x0769, B:221:0x076d, B:223:0x0777, B:236:0x07e1, B:238:0x07f6, B:240:0x07fc, B:66:0x024c, B:69:0x025f, B:70:0x0268, B:72:0x026e, B:74:0x028d, B:77:0x02a0, B:78:0x02a9, B:80:0x02af, B:81:0x02cb, B:62:0x022d, B:59:0x0218), top: B:313:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02e2 A[Catch: all -> 0x00a3, Exception -> 0x028a, TryCatch #4 {all -> 0x00a3, blocks: (B:21:0x0090, B:82:0x02dc, B:84:0x02e2, B:86:0x02f4, B:88:0x02fe, B:90:0x0304, B:92:0x030a, B:95:0x0314, B:98:0x0327, B:100:0x032d, B:102:0x033c, B:104:0x034a, B:106:0x0359, B:107:0x0365, B:109:0x036f, B:115:0x0387, B:117:0x038b, B:119:0x0395, B:121:0x039b, B:126:0x03a8, B:129:0x03c2, B:131:0x03c8, B:135:0x03d3, B:137:0x03d7, B:139:0x03e1, B:152:0x0440, B:153:0x0458, B:155:0x0461, B:159:0x0470, B:162:0x0476, B:164:0x0480, B:166:0x048c, B:167:0x0498, B:169:0x04a2, B:173:0x04b3, B:175:0x04b7, B:177:0x04c1, B:181:0x04cd, B:183:0x04dd, B:184:0x04f5, B:186:0x0521, B:189:0x05dc, B:196:0x071d, B:198:0x0722, B:207:0x0742, B:209:0x0748, B:211:0x074d, B:213:0x0756, B:215:0x075c, B:219:0x0769, B:221:0x076d, B:223:0x0777, B:236:0x07e1, B:238:0x07f6, B:240:0x07fc, B:66:0x024c, B:69:0x025f, B:70:0x0268, B:72:0x026e, B:74:0x028d, B:77:0x02a0, B:78:0x02a9, B:80:0x02af, B:81:0x02cb, B:62:0x022d, B:59:0x0218), top: B:313:0x0016 }] */
    /* JADX WARN: Type inference failed for: r12v18, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v18, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v23, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v25, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v63, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v15, types: [yh.a] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v39, types: [yh.a] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v5, types: [yh.a] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:150:0x0436 -> B:82:0x02dc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:226:0x07b4 -> B:227:0x07b6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:228:0x07c0 -> B:82:0x02dc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:279:0x0977 -> B:257:0x0875). Please report as a decompilation issue!!! */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        l lVar;
        yh.a aVar;
        s sVar;
        Object objF;
        Object objF2;
        l lVar2;
        List list;
        s sVar2;
        yh.a aVar2;
        int iA;
        String str;
        String str2;
        int iA2;
        Map map;
        l lVar3;
        Iterator it;
        s sVar3;
        LinkedHashMap linkedHashMap;
        Iterator it2;
        l lVar4;
        yh.a aVar3;
        String str3;
        String str4;
        Iterator it3;
        String str5;
        String str6;
        KeystoreEntity keystoreEntity;
        Object objF3;
        File file;
        l lVar5;
        ProjectEntity projectEntity;
        String str7;
        Map map2;
        Map map3;
        KeystoreEntity keystoreEntity2;
        long j10;
        String str8;
        String str9;
        String str10;
        String strReplaceAll;
        Uri uriPersistKeystore;
        s sVar4;
        Iterator it4;
        l lVar6;
        String str11;
        LinkedHashMap linkedHashMap2;
        String str12;
        yh.a aVar4;
        File file2;
        Object objF4;
        yh.a aVar5;
        Object next;
        String string;
        Object next2;
        String string2;
        Object next3;
        String string3;
        String strReplaceAll2;
        Uri uriPersistKeystore2;
        String sourceUrl;
        Iterator it5;
        Set setH0;
        File[] fileArrListFiles;
        Iterator it6;
        yh.a aVar6;
        String str13;
        l lVar7;
        Object objF5;
        KeystoreEntity keystoreEntity3;
        yh.a aVar7;
        File file3;
        Set set;
        l lVar8;
        Uri uriPersistKeystore3;
        String str14 = "input";
        ug.a aVar8 = ug.a.f29706a;
        ?? r32 = this.f18573m;
        String str15 = "replaceAll(...)";
        ?? r72 = "_";
        String str16 = "compile(...)";
        String str17 = "[^a-zA-Z0-9_-]";
        String str18 = "app";
        try {
            try {
                try {
                    try {
                        switch (r32) {
                            case 0:
                                pg.q.b(obj);
                                lVar = this.f18574n;
                                aVar = lVar.f18504c;
                                this.f18562a = aVar;
                                sVar = this.f18575p;
                                this.f18563b = sVar;
                                this.f18564c = lVar;
                                this.f18573m = 1;
                                if (aVar.h(this) != aVar8) {
                                    try {
                                        sh.f<List<ProjectEntity>> fVarB = sVar.b();
                                        this.f18562a = aVar;
                                        this.f18563b = sVar;
                                        this.f18564c = lVar;
                                        this.f18573m = 2;
                                        objF = gg.a.f(fVarB, this);
                                    } catch (Exception unused) {
                                        aVar2 = aVar;
                                        r72 = aVar2;
                                        pg.f0 f0Var = pg.f0.f21461a;
                                        r72.l(null);
                                        return pg.f0.f21461a;
                                    }
                                    if (objF == aVar8) {
                                        List list2 = (List) objF;
                                        sh.f<List<KeystoreEntity>> fVarE = lVar.e();
                                        this.f18562a = aVar;
                                        this.f18563b = sVar;
                                        this.f18564c = lVar;
                                        this.f18565d = list2;
                                        this.f18573m = 3;
                                        objF2 = gg.a.f(fVarE, this);
                                        if (objF2 == aVar8) {
                                            s sVar5 = sVar;
                                            lVar2 = lVar;
                                            list = list2;
                                            sVar2 = sVar5;
                                            List list3 = (List) objF2;
                                            iA = qg.j0.a(qg.p.h(list3, 10));
                                            List list4 = list;
                                            if (iA < 16) {
                                                iA = 16;
                                            }
                                            LinkedHashMap linkedHashMap3 = new LinkedHashMap(iA);
                                            for (Object obj3 : list3) {
                                                linkedHashMap3.put(i.a.b(((KeystoreEntity) obj3).getId()), obj3);
                                                str17 = str17;
                                                str18 = str18;
                                            }
                                            str = str17;
                                            str2 = str18;
                                            iA2 = qg.j0.a(qg.p.h(list3, 10));
                                            if (iA2 < 16) {
                                                iA2 = 16;
                                            }
                                            LinkedHashMap linkedHashMap4 = new LinkedHashMap(iA2);
                                            for (Object obj4 : list3) {
                                                linkedHashMap4.put(new File(((KeystoreEntity) obj4).getPath()).getCanonicalPath(), obj4);
                                                linkedHashMap3 = linkedHashMap3;
                                            }
                                            LinkedHashMap linkedHashMap5 = linkedHashMap3;
                                            LinkedHashMap linkedHashMapK = qg.k0.k(linkedHashMap4);
                                            l lVar9 = lVar2;
                                            map = linkedHashMapK;
                                            lVar3 = lVar9;
                                            it = list4.iterator();
                                            sVar3 = sVar2;
                                            linkedHashMap = linkedHashMap5;
                                            str10 = r72;
                                            if (it.hasNext()) {
                                                ProjectEntity projectEntity2 = (ProjectEntity) it.next();
                                                if (!(mh.x.A(projectEntity2.getAppName()) && mh.x.A(projectEntity2.getName()) && projectEntity2.getSourcePath() == null && ((sourceUrl = projectEntity2.getSourceUrl()) == null || mh.x.A(sourceUrl))) && kotlin.jvm.internal.r.a(ProjectKind.INSTANCE.normalize(projectEntity2.getKind()), ProjectKind.APK)) {
                                                    Long keystoreId = projectEntity2.getKeystoreId();
                                                    if (keystoreId == null || !linkedHashMap.containsKey(i.a.b(keystoreId.longValue()))) {
                                                        str3 = str14;
                                                        str4 = str15;
                                                        String string4 = mh.x.W(projectEntity2.getPackageName()).toString();
                                                        Iterator<String> it7 = mh.x.D(projectEntity2.getAppName()).iterator();
                                                        while (true) {
                                                            mh.f fVar = (mh.f) it7;
                                                            if (fVar.hasNext()) {
                                                                next = fVar.next();
                                                                if (!mh.x.A((String) next)) {
                                                                }
                                                            } else {
                                                                next = null;
                                                            }
                                                        }
                                                        String str19 = (String) next;
                                                        String str20 = "App";
                                                        if (str19 != null && (string = mh.x.W(str19).toString()) != null) {
                                                            String strB0 = mh.y.b0(50, string);
                                                            if (mh.x.A(strB0)) {
                                                                Iterator<String> it8 = mh.x.D(projectEntity2.getName()).iterator();
                                                                while (true) {
                                                                    mh.f fVar2 = (mh.f) it8;
                                                                    if (fVar2.hasNext()) {
                                                                        next2 = fVar2.next();
                                                                        if (!mh.x.A((String) next2)) {
                                                                        }
                                                                    } else {
                                                                        next2 = null;
                                                                    }
                                                                }
                                                                String str21 = (String) next2;
                                                                if (str21 != null && (string2 = mh.x.W(str21).toString()) != null) {
                                                                    strB0 = mh.y.b0(50, string2);
                                                                    if (mh.x.A(strB0)) {
                                                                    }
                                                                }
                                                            }
                                                            str20 = strB0;
                                                        }
                                                        mh.k kVar = fg.X0;
                                                        pg.n nVarC = fg.f.c(string4, str20);
                                                        String str22 = (String) nVarC.f21469a;
                                                        String str23 = (String) nVarC.f21470b;
                                                        if (str23 != null) {
                                                            Log.w("KeystoreRepository", "skipping project: " + str23);
                                                            str12 = str10;
                                                        } else {
                                                            pg.t<File, String, String> orCreateAppKeystore = KeystoreHelper.INSTANCE.getOrCreateAppKeystore(lVar3.f18503b, str22);
                                                            File fileA = orCreateAppKeystore.a();
                                                            String strB = orCreateAppKeystore.b();
                                                            String strC = orCreateAppKeystore.c();
                                                            KeystoreEntity keystoreEntity4 = (KeystoreEntity) map.get(fileA.getCanonicalPath());
                                                            if (keystoreEntity4 != null) {
                                                                ProjectEntity projectEntityCopy$default = ProjectEntity.copy$default(projectEntity2, 0L, null, null, null, 0, null, 0, 0, null, null, null, null, null, null, null, null, null, false, false, false, false, false, null, i.a.b(keystoreEntity4.getId()), null, null, false, false, null, false, null, null, null, false, false, false, false, null, 0, null, null, null, false, null, null, null, null, null, false, null, false, false, false, false, false, false, 0, 0, 0, 0, null, false, null, null, null, null, 0L, 0L, -8388609, -1, 15, null);
                                                                this.f18562a = aVar;
                                                                this.f18563b = sVar3;
                                                                this.f18564c = lVar3;
                                                                this.f18565d = map;
                                                                this.f18566e = it;
                                                                this.f18567f = linkedHashMap;
                                                                this.f18568g = null;
                                                                this.f18569h = null;
                                                                this.f18570j = null;
                                                                this.f18571k = null;
                                                                this.f18573m = 5;
                                                                str12 = str10;
                                                                if (sVar3.c(projectEntityCopy$default, this) == aVar8) {
                                                                }
                                                            } else {
                                                                str7 = str10;
                                                                StringBuilder sb = new StringBuilder();
                                                                sb.append(str20);
                                                                str5 = str16;
                                                                sb.append(" (");
                                                                sb.append(str22);
                                                                sb.append(")");
                                                                String string5 = sb.toString();
                                                                String absolutePath = fileA.getAbsolutePath();
                                                                kotlin.jvm.internal.r.d(absolutePath, "getAbsolutePath(...)");
                                                                KeystoreEntity keystoreEntity5 = new KeystoreEntity(0L, string5, absolutePath, strB, strC, "RSA", true, null, strB, 0L, 641, null);
                                                                this.f18562a = aVar;
                                                                this.f18563b = sVar3;
                                                                this.f18564c = lVar3;
                                                                this.f18565d = map;
                                                                this.f18566e = it;
                                                                this.f18567f = projectEntity2;
                                                                this.f18568g = str20;
                                                                this.f18569h = linkedHashMap;
                                                                this.f18570j = fileA;
                                                                this.f18571k = keystoreEntity5;
                                                                this.f18573m = 6;
                                                                objF3 = lVar3.f(keystoreEntity5, this);
                                                                if (objF3 != aVar8) {
                                                                    keystoreEntity = keystoreEntity5;
                                                                    r72 = aVar;
                                                                    file = fileA;
                                                                    it3 = it;
                                                                    str6 = str20;
                                                                    projectEntity = projectEntity2;
                                                                    lVar5 = lVar3;
                                                                    map2 = map;
                                                                    try {
                                                                        try {
                                                                            long jLongValue = ((Number) objF3).longValue();
                                                                            keystoreEntity2 = keystoreEntity;
                                                                            map2.put(file.getCanonicalPath(), keystoreEntity.copy((759 & 1) != 0 ? keystoreEntity.f5741id : jLongValue, (759 & 2) != 0 ? keystoreEntity.alias : null, (759 & 4) != 0 ? keystoreEntity.path : null, (759 & 8) != 0 ? keystoreEntity.password : null, (759 & 16) != 0 ? keystoreEntity.keyAlias : null, (759 & 32) != 0 ? keystoreEntity.algorithm : null, (759 & 64) != 0 ? keystoreEntity.isPersisted : false, (759 & 128) != 0 ? keystoreEntity.publicUri : null, (759 & 256) != 0 ? keystoreEntity.keyPassword : null, (759 & 512) != 0 ? keystoreEntity.createdAt : 0L));
                                                                            ProjectEntity projectEntityCopy$default2 = ProjectEntity.copy$default(projectEntity, 0L, null, null, null, 0, null, 0, 0, null, null, null, null, null, null, null, null, null, false, false, false, false, false, null, i.a.b(jLongValue), null, null, false, false, null, false, null, null, null, false, false, false, false, null, 0, null, null, null, false, null, null, null, null, null, false, null, false, false, false, false, false, false, 0, 0, 0, 0, null, false, null, null, null, null, 0L, 0L, -8388609, -1, 15, null);
                                                                            this.f18562a = r72;
                                                                            this.f18563b = sVar3;
                                                                            this.f18564c = lVar5;
                                                                            this.f18565d = map2;
                                                                            this.f18566e = it3;
                                                                            this.f18567f = str6;
                                                                            this.f18568g = linkedHashMap;
                                                                            this.f18569h = file;
                                                                            this.f18570j = keystoreEntity2;
                                                                            this.f18571k = null;
                                                                            aVar = r72;
                                                                            j10 = jLongValue;
                                                                            this.f18572l = j10;
                                                                            lVar6 = lVar5;
                                                                            this.f18573m = 7;
                                                                            break;
                                                                        } catch (Exception unused2) {
                                                                            aVar = r72;
                                                                            aVar2 = aVar;
                                                                            r72 = aVar2;
                                                                            pg.f0 f0Var2 = pg.f0.f21461a;
                                                                            r72.l(null);
                                                                            return pg.f0.f21461a;
                                                                        }
                                                                    } catch (Throwable th2) {
                                                                        th = th2;
                                                                        r72.l(null);
                                                                        throw th;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        str14 = str3;
                                                        str15 = str4;
                                                        str10 = str12;
                                                    } else {
                                                        KeystoreEntity keystoreEntity6 = (KeystoreEntity) linkedHashMap.get(projectEntity2.getKeystoreId());
                                                        if (keystoreEntity6 != null) {
                                                            try {
                                                            } catch (Exception unused3) {
                                                                str3 = str14;
                                                                break;
                                                            }
                                                            File file4 = new File(keystoreEntity6.getPath());
                                                            if (file4.exists()) {
                                                                Iterator<String> it9 = mh.x.D(projectEntity2.getAppName()).iterator();
                                                                while (true) {
                                                                    try {
                                                                    } catch (Exception unused4) {
                                                                        str3 = str14;
                                                                        break;
                                                                    }
                                                                    mh.f fVar3 = (mh.f) it9;
                                                                    if (fVar3.hasNext()) {
                                                                        try {
                                                                        } catch (Exception unused5) {
                                                                            str3 = str14;
                                                                            lVar4 = lVar3;
                                                                            str4 = str15;
                                                                            linkedHashMap2 = linkedHashMap;
                                                                            aVar3 = aVar;
                                                                            it2 = it;
                                                                            str11 = str10;
                                                                            linkedHashMap = linkedHashMap2;
                                                                            it = it2;
                                                                            lVar3 = lVar4;
                                                                            aVar = aVar3;
                                                                            str12 = str11;
                                                                            str14 = str3;
                                                                            str15 = str4;
                                                                            str10 = str12;
                                                                            if (it.hasNext()) {
                                                                            }
                                                                            return aVar8;
                                                                        }
                                                                        next3 = fVar3.next();
                                                                        if (!mh.x.A((String) next3)) {
                                                                        }
                                                                    } else {
                                                                        next3 = null;
                                                                    }
                                                                }
                                                                String str24 = (String) next3;
                                                                if (str24 != null && (string3 = mh.x.W(str24).toString()) != null) {
                                                                    if (mh.x.A(string3)) {
                                                                        string3 = projectEntity2.getName();
                                                                    }
                                                                    if (string3 == null) {
                                                                    }
                                                                    str3 = str14;
                                                                    Pattern patternCompile = Pattern.compile(str);
                                                                    kotlin.jvm.internal.r.d(patternCompile, str16);
                                                                    strReplaceAll2 = patternCompile.matcher(string3).replaceAll(str10);
                                                                    kotlin.jvm.internal.r.d(strReplaceAll2, str15);
                                                                    if (mh.x.A(strReplaceAll2)) {
                                                                        strReplaceAll2 = str2;
                                                                    }
                                                                    if (keystoreEntity6.getPublicUri() != null) {
                                                                        try {
                                                                        } catch (Exception unused6) {
                                                                            lVar4 = lVar3;
                                                                            str4 = str15;
                                                                            linkedHashMap2 = linkedHashMap;
                                                                            aVar3 = aVar;
                                                                            it2 = it;
                                                                            str11 = str10;
                                                                            linkedHashMap = linkedHashMap2;
                                                                            it = it2;
                                                                            lVar3 = lVar4;
                                                                            aVar = aVar3;
                                                                            str12 = str11;
                                                                            str14 = str3;
                                                                            str15 = str4;
                                                                            str10 = str12;
                                                                            if (it.hasNext()) {
                                                                            }
                                                                            return aVar8;
                                                                        }
                                                                        if (!keystoreEntity6.isPersisted()) {
                                                                        }
                                                                        str14 = str3;
                                                                        str15 = str4;
                                                                        str10 = str12;
                                                                    }
                                                                    str4 = str15;
                                                                    uriPersistKeystore2 = KeystoreStorage.INSTANCE.persistKeystore(lVar3.f18503b, file4, strReplaceAll2);
                                                                    str12 = str10;
                                                                    if (uriPersistKeystore2 != null) {
                                                                        KeystoreEntity keystoreEntityCopy = keystoreEntity6.copy((759 & 1) != 0 ? keystoreEntity6.f5741id : 0L, (759 & 2) != 0 ? keystoreEntity6.alias : null, (759 & 4) != 0 ? keystoreEntity6.path : null, (759 & 8) != 0 ? keystoreEntity6.password : null, (759 & 16) != 0 ? keystoreEntity6.keyAlias : null, (759 & 32) != 0 ? keystoreEntity6.algorithm : null, (759 & 64) != 0 ? keystoreEntity6.isPersisted : true, (759 & 128) != 0 ? keystoreEntity6.publicUri : uriPersistKeystore2.toString(), (759 & 256) != 0 ? keystoreEntity6.keyPassword : null, (759 & 512) != 0 ? keystoreEntity6.createdAt : 0L);
                                                                        this.f18562a = aVar;
                                                                        this.f18563b = sVar3;
                                                                        this.f18564c = lVar3;
                                                                        this.f18565d = map;
                                                                        this.f18566e = it;
                                                                        this.f18567f = linkedHashMap;
                                                                        this.f18568g = null;
                                                                        this.f18569h = null;
                                                                        this.f18570j = null;
                                                                        this.f18571k = null;
                                                                        this.f18573m = 4;
                                                                        if (lVar3.h(keystoreEntityCopy, this) != aVar8) {
                                                                            lVar4 = lVar3;
                                                                            linkedHashMap2 = linkedHashMap;
                                                                            aVar3 = aVar;
                                                                            it2 = it;
                                                                            str11 = str10;
                                                                            linkedHashMap = linkedHashMap2;
                                                                            it = it2;
                                                                            lVar3 = lVar4;
                                                                            aVar = aVar3;
                                                                            str12 = str11;
                                                                        }
                                                                    }
                                                                    str14 = str3;
                                                                    str15 = str4;
                                                                    str10 = str12;
                                                                }
                                                                string3 = str2;
                                                                str3 = str14;
                                                                Pattern patternCompile2 = Pattern.compile(str);
                                                                kotlin.jvm.internal.r.d(patternCompile2, str16);
                                                                strReplaceAll2 = patternCompile2.matcher(string3).replaceAll(str10);
                                                                kotlin.jvm.internal.r.d(strReplaceAll2, str15);
                                                                if (mh.x.A(strReplaceAll2)) {
                                                                }
                                                                if (keystoreEntity6.getPublicUri() != null) {
                                                                }
                                                                str4 = str15;
                                                                uriPersistKeystore2 = KeystoreStorage.INSTANCE.persistKeystore(lVar3.f18503b, file4, strReplaceAll2);
                                                                str12 = str10;
                                                                if (uriPersistKeystore2 != null) {
                                                                }
                                                                str14 = str3;
                                                                str15 = str4;
                                                                str10 = str12;
                                                            }
                                                        }
                                                        str3 = str14;
                                                    }
                                                    if (it.hasNext()) {
                                                        try {
                                                            file2 = new File(lVar3.f18503b.getFilesDir(), "app_keystores");
                                                        } catch (Exception unused7) {
                                                            aVar4 = aVar;
                                                            r72 = aVar4;
                                                            pg.f0 f0Var22 = pg.f0.f21461a;
                                                            r72.l(null);
                                                            return pg.f0.f21461a;
                                                        }
                                                        if (!file2.exists() || !file2.isDirectory()) {
                                                            r72 = aVar;
                                                            pg.f0 f0Var222 = pg.f0.f21461a;
                                                            r72.l(null);
                                                            return pg.f0.f21461a;
                                                        }
                                                        sh.f<List<KeystoreEntity>> fVarE2 = lVar3.e();
                                                        this.f18562a = aVar;
                                                        this.f18563b = lVar3;
                                                        this.f18564c = file2;
                                                        this.f18565d = null;
                                                        this.f18566e = null;
                                                        this.f18567f = null;
                                                        this.f18568g = null;
                                                        this.f18569h = null;
                                                        this.f18570j = null;
                                                        this.f18571k = null;
                                                        this.f18573m = 9;
                                                        objF4 = gg.a.f(fVarE2, this);
                                                        if (objF4 != aVar8) {
                                                            aVar5 = aVar;
                                                            Iterable iterable = (Iterable) objF4;
                                                            ArrayList arrayList = new ArrayList(qg.p.h(iterable, 10));
                                                            it5 = iterable.iterator();
                                                            while (it5.hasNext()) {
                                                                arrayList.add(new File(((KeystoreEntity) it5.next()).getPath()).getCanonicalPath());
                                                            }
                                                            setH0 = qg.x.h0(arrayList);
                                                            fileArrListFiles = file2.listFiles();
                                                            r72 = aVar5;
                                                            if (fileArrListFiles != null) {
                                                                ArrayList arrayList2 = new ArrayList();
                                                                for (File file5 : fileArrListFiles) {
                                                                    if (file5.isDirectory()) {
                                                                        arrayList2.add(file5);
                                                                    }
                                                                }
                                                                it6 = arrayList2.iterator();
                                                                aVar6 = aVar5;
                                                                while (it6.hasNext()) {
                                                                    File file6 = (File) it6.next();
                                                                    file3 = new File(file6, "keystore.p12");
                                                                    if (file3.exists() && !setH0.contains(file3.getCanonicalPath())) {
                                                                        String name = file6.getName();
                                                                        KeystorePasswordStorage keystorePasswordStorage = new KeystorePasswordStorage(lVar3.f18503b);
                                                                        kotlin.jvm.internal.r.b(name);
                                                                        String appKeystorePassword = keystorePasswordStorage.getAppKeystorePassword(name);
                                                                        if (appKeystorePassword != null) {
                                                                            KeystoreHelper keystoreHelper = KeystoreHelper.INSTANCE;
                                                                            if (KeystoreHelper.verifyKeystore$default(keystoreHelper, file3, appKeystorePassword, keystoreHelper.getDefaultKeyAlias(), null, 8, null)) {
                                                                                String absolutePath2 = file3.getAbsolutePath();
                                                                                kotlin.jvm.internal.r.d(absolutePath2, "getAbsolutePath(...)");
                                                                                KeystoreEntity keystoreEntity7 = new KeystoreEntity(0L, "Legacy Keystore (" + name + ")", absolutePath2, appKeystorePassword, keystoreHelper.getDefaultKeyAlias(), "RSA", true, null, appKeystorePassword, 0L, 641, null);
                                                                                this.f18562a = aVar6;
                                                                                this.f18563b = lVar3;
                                                                                this.f18564c = setH0;
                                                                                this.f18565d = it6;
                                                                                this.f18566e = file3;
                                                                                this.f18567f = name;
                                                                                this.f18568g = keystoreEntity7;
                                                                                this.f18573m = 10;
                                                                                objF5 = lVar3.f(keystoreEntity7, this);
                                                                                if (objF5 != aVar8) {
                                                                                    keystoreEntity3 = keystoreEntity7;
                                                                                    lVar7 = lVar3;
                                                                                    str13 = name;
                                                                                    aVar7 = aVar6;
                                                                                    long jLongValue2 = ((Number) objF5).longValue();
                                                                                    uriPersistKeystore3 = KeystoreStorage.INSTANCE.persistKeystore(lVar7.f18503b, file3, "legacy_" + str13);
                                                                                    if (uriPersistKeystore3 == null) {
                                                                                        KeystoreEntity keystoreEntityCopy2 = keystoreEntity3.copy((759 & 1) != 0 ? keystoreEntity3.f5741id : jLongValue2, (759 & 2) != 0 ? keystoreEntity3.alias : null, (759 & 4) != 0 ? keystoreEntity3.path : null, (759 & 8) != 0 ? keystoreEntity3.password : null, (759 & 16) != 0 ? keystoreEntity3.keyAlias : null, (759 & 32) != 0 ? keystoreEntity3.algorithm : null, (759 & 64) != 0 ? keystoreEntity3.isPersisted : false, (759 & 128) != 0 ? keystoreEntity3.publicUri : uriPersistKeystore3.toString(), (759 & 256) != 0 ? keystoreEntity3.keyPassword : null, (759 & 512) != 0 ? keystoreEntity3.createdAt : 0L);
                                                                                        this.f18562a = aVar7;
                                                                                        this.f18563b = lVar7;
                                                                                        this.f18564c = setH0;
                                                                                        this.f18565d = it6;
                                                                                        this.f18566e = null;
                                                                                        this.f18567f = null;
                                                                                        this.f18568g = null;
                                                                                        this.f18573m = 11;
                                                                                        if (lVar7.h(keystoreEntityCopy2, this) != aVar8) {
                                                                                            set = setH0;
                                                                                            lVar8 = lVar7;
                                                                                            l lVar10 = lVar8;
                                                                                            setH0 = set;
                                                                                            lVar3 = lVar10;
                                                                                            aVar6 = aVar7;
                                                                                            while (it6.hasNext()) {
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        lVar3 = lVar7;
                                                                                        aVar6 = aVar7;
                                                                                        while (it6.hasNext()) {
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            continue;
                                                                        }
                                                                    }
                                                                }
                                                                pg.f0 f0Var3 = pg.f0.f21461a;
                                                                r72 = aVar6;
                                                            }
                                                            pg.f0 f0Var2222 = pg.f0.f21461a;
                                                            r72.l(null);
                                                            return pg.f0.f21461a;
                                                        }
                                                    }
                                                } else {
                                                    str3 = str14;
                                                }
                                                str4 = str15;
                                                str12 = str10;
                                                str14 = str3;
                                                str15 = str4;
                                                str10 = str12;
                                                if (it.hasNext()) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return aVar8;
                            case 1:
                                lVar = (l) this.f18564c;
                                s sVar6 = (s) this.f18563b;
                                yh.a aVar9 = this.f18562a;
                                pg.q.b(obj);
                                sVar = sVar6;
                                aVar = aVar9;
                                sh.f<List<ProjectEntity>> fVarB2 = sVar.b();
                                this.f18562a = aVar;
                                this.f18563b = sVar;
                                this.f18564c = lVar;
                                this.f18573m = 2;
                                objF = gg.a.f(fVarB2, this);
                                if (objF == aVar8) {
                                }
                                return aVar8;
                            case 2:
                                lVar = (l) this.f18564c;
                                s sVar7 = (s) this.f18563b;
                                yh.a aVar10 = this.f18562a;
                                try {
                                    pg.q.b(obj);
                                    sVar = sVar7;
                                    aVar = aVar10;
                                    objF = obj;
                                    List list22 = (List) objF;
                                    sh.f<List<KeystoreEntity>> fVarE3 = lVar.e();
                                    this.f18562a = aVar;
                                    this.f18563b = sVar;
                                    this.f18564c = lVar;
                                    this.f18565d = list22;
                                    this.f18573m = 3;
                                    objF2 = gg.a.f(fVarE3, this);
                                    if (objF2 == aVar8) {
                                    }
                                } catch (Exception unused8) {
                                    aVar2 = aVar10;
                                    r72 = aVar2;
                                    pg.f0 f0Var22222 = pg.f0.f21461a;
                                    r72.l(null);
                                    return pg.f0.f21461a;
                                } catch (Throwable th3) {
                                    th = th3;
                                    r72 = aVar10;
                                    r72.l(null);
                                    throw th;
                                }
                                break;
                            case 3:
                                list = (List) this.f18565d;
                                l lVar11 = (l) this.f18564c;
                                s sVar8 = (s) this.f18563b;
                                yh.a aVar11 = this.f18562a;
                                try {
                                    pg.q.b(obj);
                                    lVar2 = lVar11;
                                    aVar = aVar11;
                                    sVar2 = sVar8;
                                    objF2 = obj;
                                    List list32 = (List) objF2;
                                    iA = qg.j0.a(qg.p.h(list32, 10));
                                    List list42 = list;
                                    if (iA < 16) {
                                    }
                                    LinkedHashMap linkedHashMap32 = new LinkedHashMap(iA);
                                    while (r15.hasNext()) {
                                    }
                                    str = str17;
                                    str2 = str18;
                                    iA2 = qg.j0.a(qg.p.h(list32, 10));
                                    if (iA2 < 16) {
                                    }
                                    LinkedHashMap linkedHashMap42 = new LinkedHashMap(iA2);
                                    while (r9.hasNext()) {
                                    }
                                    LinkedHashMap linkedHashMap52 = linkedHashMap32;
                                    LinkedHashMap linkedHashMapK2 = qg.k0.k(linkedHashMap42);
                                    l lVar92 = lVar2;
                                    map = linkedHashMapK2;
                                    lVar3 = lVar92;
                                    it = list42.iterator();
                                    sVar3 = sVar2;
                                    linkedHashMap = linkedHashMap52;
                                    str10 = r72;
                                    if (it.hasNext()) {
                                    }
                                    return aVar8;
                                } catch (Exception unused9) {
                                    aVar2 = aVar11;
                                    r72 = aVar2;
                                    pg.f0 f0Var222222 = pg.f0.f21461a;
                                    r72.l(null);
                                    return pg.f0.f21461a;
                                } catch (Throwable th4) {
                                    th = th4;
                                    r72 = aVar11;
                                    r72.l(null);
                                    throw th;
                                }
                            case 4:
                                ?? r33 = (Map) this.f18567f;
                                it2 = (Iterator) this.f18566e;
                                map = (Map) this.f18565d;
                                lVar4 = (l) this.f18564c;
                                sVar3 = (s) this.f18563b;
                                aVar3 = this.f18562a;
                                try {
                                    pg.q.b(obj);
                                } catch (Exception unused10) {
                                }
                                str3 = "input";
                                str4 = "replaceAll(...)";
                                str = "[^a-zA-Z0-9_-]";
                                str2 = "app";
                                linkedHashMap2 = r33;
                                str11 = r72;
                                linkedHashMap = linkedHashMap2;
                                it = it2;
                                lVar3 = lVar4;
                                aVar = aVar3;
                                str12 = str11;
                                str14 = str3;
                                str15 = str4;
                                str10 = str12;
                                if (it.hasNext()) {
                                }
                                return aVar8;
                            case 5:
                                ?? r34 = (Map) this.f18567f;
                                Iterator it10 = (Iterator) this.f18566e;
                                map = (Map) this.f18565d;
                                l lVar12 = (l) this.f18564c;
                                sVar3 = (s) this.f18563b;
                                yh.a aVar12 = this.f18562a;
                                try {
                                    pg.q.b(obj);
                                    str3 = "input";
                                    str4 = "replaceAll(...)";
                                    str = "[^a-zA-Z0-9_-]";
                                    str2 = "app";
                                    it = it10;
                                    aVar = aVar12;
                                    linkedHashMap = r34;
                                    lVar3 = lVar12;
                                    str12 = r72;
                                    str14 = str3;
                                    str15 = str4;
                                    str10 = str12;
                                    if (it.hasNext()) {
                                    }
                                    return aVar8;
                                } catch (Exception unused11) {
                                    aVar2 = aVar12;
                                    r72 = aVar2;
                                    pg.f0 f0Var2222222 = pg.f0.f21461a;
                                    r72.l(null);
                                    return pg.f0.f21461a;
                                }
                            case 6:
                                KeystoreEntity keystoreEntity8 = this.f18571k;
                                File file7 = (File) this.f18570j;
                                ?? r12 = (Map) this.f18569h;
                                String str25 = (String) this.f18568g;
                                ProjectEntity projectEntity3 = (ProjectEntity) this.f18567f;
                                it3 = (Iterator) this.f18566e;
                                Map map4 = (Map) this.f18565d;
                                l lVar13 = (l) this.f18564c;
                                s sVar9 = (s) this.f18563b;
                                aVar2 = this.f18562a;
                                try {
                                    pg.q.b(obj);
                                    str5 = "compile(...)";
                                    str2 = "app";
                                    str6 = str25;
                                    keystoreEntity = keystoreEntity8;
                                    objF3 = obj;
                                    str3 = "input";
                                    file = file7;
                                    lVar5 = lVar13;
                                    str4 = "replaceAll(...)";
                                    projectEntity = projectEntity3;
                                    sVar3 = sVar9;
                                    str7 = "_";
                                    r72 = aVar2;
                                    map2 = map4;
                                    str = "[^a-zA-Z0-9_-]";
                                    linkedHashMap = r12;
                                    long jLongValue3 = ((Number) objF3).longValue();
                                    keystoreEntity2 = keystoreEntity;
                                    map2.put(file.getCanonicalPath(), keystoreEntity.copy((759 & 1) != 0 ? keystoreEntity.f5741id : jLongValue3, (759 & 2) != 0 ? keystoreEntity.alias : null, (759 & 4) != 0 ? keystoreEntity.path : null, (759 & 8) != 0 ? keystoreEntity.password : null, (759 & 16) != 0 ? keystoreEntity.keyAlias : null, (759 & 32) != 0 ? keystoreEntity.algorithm : null, (759 & 64) != 0 ? keystoreEntity.isPersisted : false, (759 & 128) != 0 ? keystoreEntity.publicUri : null, (759 & 256) != 0 ? keystoreEntity.keyPassword : null, (759 & 512) != 0 ? keystoreEntity.createdAt : 0L));
                                    ProjectEntity projectEntityCopy$default22 = ProjectEntity.copy$default(projectEntity, 0L, null, null, null, 0, null, 0, 0, null, null, null, null, null, null, null, null, null, false, false, false, false, false, null, i.a.b(jLongValue3), null, null, false, false, null, false, null, null, null, false, false, false, false, null, 0, null, null, null, false, null, null, null, null, null, false, null, false, false, false, false, false, false, 0, 0, 0, 0, null, false, null, null, null, null, 0L, 0L, -8388609, -1, 15, null);
                                    this.f18562a = r72;
                                    this.f18563b = sVar3;
                                    this.f18564c = lVar5;
                                    this.f18565d = map2;
                                    this.f18566e = it3;
                                    this.f18567f = str6;
                                    this.f18568g = linkedHashMap;
                                    this.f18569h = file;
                                    this.f18570j = keystoreEntity2;
                                    this.f18571k = null;
                                    aVar = r72;
                                    j10 = jLongValue3;
                                    this.f18572l = j10;
                                    lVar6 = lVar5;
                                    this.f18573m = 7;
                                    break;
                                } catch (Exception unused12) {
                                    r72 = aVar2;
                                    pg.f0 f0Var22222222 = pg.f0.f21461a;
                                    r72.l(null);
                                    return pg.f0.f21461a;
                                }
                            case 7:
                                long j11 = this.f18572l;
                                KeystoreEntity keystoreEntity9 = (KeystoreEntity) this.f18570j;
                                file = (File) this.f18569h;
                                ?? r14 = (Map) this.f18568g;
                                String str26 = (String) this.f18567f;
                                Iterator it11 = (Iterator) this.f18566e;
                                Map map5 = (Map) this.f18565d;
                                l lVar14 = (l) this.f18564c;
                                s sVar10 = (s) this.f18563b;
                                yh.a aVar13 = this.f18562a;
                                try {
                                    pg.q.b(obj);
                                } catch (Exception unused13) {
                                }
                                str = "[^a-zA-Z0-9_-]";
                                linkedHashMap = r14;
                                sVar3 = sVar10;
                                str2 = "app";
                                str6 = str26;
                                it3 = it11;
                                str5 = "compile(...)";
                                str3 = "input";
                                map3 = map5;
                                str4 = "replaceAll(...)";
                                aVar = aVar13;
                                keystoreEntity2 = keystoreEntity9;
                                lVar3 = lVar14;
                                str7 = "_";
                                j10 = j11;
                                long j12 = j10;
                                KeystoreEntity keystoreEntity10 = keystoreEntity2;
                                map = map3;
                                try {
                                } catch (Exception unused14) {
                                    break;
                                }
                                Pattern patternCompile3 = Pattern.compile(str);
                                String str27 = str5;
                                kotlin.jvm.internal.r.d(patternCompile3, str27);
                                String str28 = str3;
                                kotlin.jvm.internal.r.e(str6, str28);
                                str9 = str7;
                                strReplaceAll = patternCompile3.matcher(str6).replaceAll(str9);
                                str8 = str4;
                                kotlin.jvm.internal.r.d(strReplaceAll, str8);
                                if (mh.x.A(strReplaceAll)) {
                                    strReplaceAll = str2;
                                }
                                str5 = str27;
                                str3 = str28;
                                uriPersistKeystore = KeystoreStorage.INSTANCE.persistKeystore(lVar3.f18503b, file, strReplaceAll);
                                if (uriPersistKeystore != null) {
                                    KeystoreEntity keystoreEntityCopy3 = keystoreEntity10.copy((759 & 1) != 0 ? keystoreEntity10.f5741id : j12, (759 & 2) != 0 ? keystoreEntity10.alias : null, (759 & 4) != 0 ? keystoreEntity10.path : null, (759 & 8) != 0 ? keystoreEntity10.password : null, (759 & 16) != 0 ? keystoreEntity10.keyAlias : null, (759 & 32) != 0 ? keystoreEntity10.algorithm : null, (759 & 64) != 0 ? keystoreEntity10.isPersisted : false, (759 & 128) != 0 ? keystoreEntity10.publicUri : uriPersistKeystore.toString(), (759 & 256) != 0 ? keystoreEntity10.keyPassword : null, (759 & 512) != 0 ? keystoreEntity10.createdAt : 0L);
                                    this.f18562a = aVar;
                                    this.f18563b = sVar3;
                                    this.f18564c = lVar3;
                                    this.f18565d = map;
                                    this.f18566e = it3;
                                    this.f18567f = linkedHashMap;
                                    this.f18568g = null;
                                    this.f18569h = null;
                                    this.f18570j = null;
                                    this.f18571k = null;
                                    this.f18573m = 8;
                                    if (lVar3.h(keystoreEntityCopy3, this) != aVar8) {
                                        sVar4 = sVar3;
                                        it4 = it3;
                                        str10 = str9;
                                        str15 = str8;
                                        it = it4;
                                        str16 = str5;
                                        sVar3 = sVar4;
                                        str14 = str3;
                                        if (it.hasNext()) {
                                        }
                                    }
                                    return aVar8;
                                }
                                str10 = str9;
                                str15 = str8;
                                it = it3;
                                str14 = str3;
                                str16 = str5;
                                if (it.hasNext()) {
                                }
                                return aVar8;
                            case 8:
                                ?? r35 = (Map) this.f18567f;
                                it4 = (Iterator) this.f18566e;
                                Map map6 = (Map) this.f18565d;
                                l lVar15 = (l) this.f18564c;
                                s sVar11 = (s) this.f18563b;
                                aVar = this.f18562a;
                                try {
                                    pg.q.b(obj);
                                    str3 = "input";
                                    str5 = "compile(...)";
                                    str = "[^a-zA-Z0-9_-]";
                                    str2 = "app";
                                    sVar4 = sVar11;
                                    map = map6;
                                    linkedHashMap = r35;
                                    str8 = "replaceAll(...)";
                                    str9 = "_";
                                    lVar3 = lVar15;
                                } catch (Exception unused15) {
                                    sVar3 = sVar11;
                                    map = map6;
                                    it3 = it4;
                                    str3 = "input";
                                    str5 = "compile(...)";
                                    str = "[^a-zA-Z0-9_-]";
                                    str2 = "app";
                                    linkedHashMap = r35;
                                    str8 = "replaceAll(...)";
                                    str9 = "_";
                                    lVar3 = lVar15;
                                    break;
                                }
                                str10 = str9;
                                str15 = str8;
                                it = it4;
                                str16 = str5;
                                sVar3 = sVar4;
                                str14 = str3;
                                if (it.hasNext()) {
                                }
                                return aVar8;
                            case 9:
                                file2 = (File) this.f18564c;
                                lVar3 = (l) this.f18563b;
                                aVar6 = this.f18562a;
                                try {
                                    pg.q.b(obj);
                                    objF4 = obj;
                                    aVar5 = aVar6;
                                    Iterable iterable2 = (Iterable) objF4;
                                    ArrayList arrayList3 = new ArrayList(qg.p.h(iterable2, 10));
                                    it5 = iterable2.iterator();
                                    while (it5.hasNext()) {
                                    }
                                    setH0 = qg.x.h0(arrayList3);
                                    fileArrListFiles = file2.listFiles();
                                    r72 = aVar5;
                                    if (fileArrListFiles != null) {
                                    }
                                } catch (Exception unused16) {
                                    aVar4 = aVar6;
                                    r72 = aVar4;
                                    pg.f0 f0Var222222222 = pg.f0.f21461a;
                                    r72.l(null);
                                    return pg.f0.f21461a;
                                }
                                pg.f0 f0Var2222222222 = pg.f0.f21461a;
                                r72.l(null);
                                return pg.f0.f21461a;
                            case 10:
                                KeystoreEntity keystoreEntity11 = (KeystoreEntity) this.f18568g;
                                str13 = (String) this.f18567f;
                                File file8 = (File) this.f18566e;
                                Iterator it12 = (Iterator) this.f18565d;
                                Set set2 = (Set) this.f18564c;
                                lVar7 = (l) this.f18563b;
                                aVar4 = this.f18562a;
                                try {
                                    pg.q.b(obj);
                                    objF5 = obj;
                                    keystoreEntity3 = keystoreEntity11;
                                    it6 = it12;
                                    aVar7 = aVar4;
                                    file3 = file8;
                                    setH0 = set2;
                                    long jLongValue22 = ((Number) objF5).longValue();
                                    uriPersistKeystore3 = KeystoreStorage.INSTANCE.persistKeystore(lVar7.f18503b, file3, "legacy_" + str13);
                                    if (uriPersistKeystore3 == null) {
                                    }
                                } catch (Exception unused17) {
                                    r72 = aVar4;
                                    pg.f0 f0Var22222222222 = pg.f0.f21461a;
                                    r72.l(null);
                                    return pg.f0.f21461a;
                                } catch (Throwable th5) {
                                    th = th5;
                                    r72 = aVar4;
                                    r72.l(null);
                                    throw th;
                                }
                                break;
                            case 11:
                                it6 = (Iterator) this.f18565d;
                                set = (Set) this.f18564c;
                                lVar8 = (l) this.f18563b;
                                aVar7 = this.f18562a;
                                try {
                                    pg.q.b(obj);
                                } catch (Exception unused18) {
                                }
                                l lVar102 = lVar8;
                                setH0 = set;
                                lVar3 = lVar102;
                                aVar6 = aVar7;
                                while (it6.hasNext()) {
                                }
                                pg.f0 f0Var32 = pg.f0.f21461a;
                                r72 = aVar6;
                                pg.f0 f0Var222222222222 = pg.f0.f21461a;
                                r72.l(null);
                                return pg.f0.f21461a;
                            default:
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        map3 = map2;
                        lVar3 = lVar6;
                        long j122 = j10;
                        KeystoreEntity keystoreEntity102 = keystoreEntity2;
                        map = map3;
                        Pattern patternCompile32 = Pattern.compile(str);
                        String str272 = str5;
                        kotlin.jvm.internal.r.d(patternCompile32, str272);
                        String str282 = str3;
                        kotlin.jvm.internal.r.e(str6, str282);
                        str9 = str7;
                        strReplaceAll = patternCompile32.matcher(str6).replaceAll(str9);
                        str8 = str4;
                        kotlin.jvm.internal.r.d(strReplaceAll, str8);
                        if (mh.x.A(strReplaceAll)) {
                        }
                        str5 = str272;
                        str3 = str282;
                        uriPersistKeystore = KeystoreStorage.INSTANCE.persistKeystore(lVar3.f18503b, file, strReplaceAll);
                        if (uriPersistKeystore != null) {
                        }
                        str10 = str9;
                        str15 = str8;
                        it = it3;
                        str14 = str3;
                        str16 = str5;
                        if (it.hasNext()) {
                        }
                        return aVar8;
                    } catch (Throwable th6) {
                        th = th6;
                        r72 = aVar;
                    }
                } catch (Throwable th7) {
                    th = th7;
                }
            } catch (Throwable th8) {
                th = th8;
                r72 = obj2;
            }
        } catch (Throwable th9) {
            th = th9;
            r72 = r32;
        }
    }
}
