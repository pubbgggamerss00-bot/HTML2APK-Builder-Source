# HTML2APK — Complete Transformation Report

**Source app:** HTML to APK Builder v1.32-zfix2 (`com.basitce.htmltoapk`, versionCode 45)
**Target identity:** HTML2APK — Premium Dark Neon
**Date:** 2026-11-07
**Method:** Full source audit → resource/DEX-level transformation of the original working APK → synchronized patches to the decompiled source project → rebuild, sign, verify.

---

## 0. Executive summary — read this first

The supplied archive contains a **jadx-decompiled** copy of the app (R8-obfuscated, Pairip-protected), **not** a clean original-source checkout. This fact shapes everything:

| Goal | Status | Why |
|---|---|---|
| Preserve 100 % of app functionality | ✅ **Delivered** | The transformation edits resources + 3 string constants in DEX. All logic, the entire build engine, licensing and security layers are byte-identical to the original. |
| HTML2APK branding (name, icon, theme, emails) | ✅ **Delivered** | Applied to a rebuilt APK **and** the decompiled source tree. Verified via `aapt dump badging` and DEX string-pool inspection. |
| Installable signed APK | ⚠️ **Built + signature-verified, runtime launch NOT verified** | No emulator/device exists in this environment. Re-signing trips Pairip integrity expectations — see Limitation L4. Do not assume it launches until you install it. |
| Complete Compose UI redesign (per-screen dark-neon component system, animations) | ❌ **Not feasible from this source** | The UI is R8-obfuscated across ~499 packages (3,328 files with decompiler markers, 931 with lost blocks). Rewriting it is a clean-room rebuild, documented in §8. |
| Remove "Get Pro for Free" entry | ⚠️ **Located precisely, not removable at resource/DEX-string level** | Route `free_premium` + navigation live in obfuscated Compose code. Its submission email was retargeted. See Limitation L2. |
| Rebuild the decompiled project with Gradle | ❌ **Impossible as supplied** | jadx-generated `build.gradle` contains `dependencies { // TODO: dependencies }` — zero dependencies vs. 100+ imported libraries; 43/118 core files carry decompiler artifacts. Root-caused in QA test T11. |

Everything below is evidence-based; nothing is claimed as "passed" unless it was actually executed in this session (see §6).

---

## 1. Source audit

### 1.1 Application identity

| Item | Value |
|---|---|
| Package | `com.basitce.htmltoapk` |
| Version | 1.32-zfix2 (versionCode 45) |
| Min / Target SDK | 28 (Android 9) / 36 (Android 16 "Baklava") |
| Language | Kotlin + Jetpack Compose (single-activity, Navigation-Compose) |
| Protection | Pairip license/integrity service + R8 obfuscation |
| Native libs | arm64-v8a only (`libdatastore_shared_counter.so`, `libandroidx.graphics.path.so`) |
| Database | Room `html_to_apk.db`, **version 21**, 14 recorded migrations |
| Signed with | v1 (JAR `MANIFEST.MF` + Pairip's `APPFIX.SF/RSA`) + inner schemes |

### 1.2 Code inventory

- **118 clear-named Java files (~29,400 lines)** under `com.basitce.htmltoapk/`: MainActivity, domain models, `data/apkgenerator/*` (55 files — the build engine), `data/apkgenerator/binaryxml/*` (in-app AAPT), `data/apkgenerator/signer/*` (apksig-based), `data/local/*` (Room), `data/licenses/*`, `ui/screens/preview/*` (PDF), `ui/crop/*` (uCrop-compatible), `util/*`.
- **~499 R8-obfuscated packages** (a, b, … zh) hold the Compose UI/ViewModels — **43 of the 118 core files still carry jadx artifacts; 3,328 files tree-wide carry jadx markers, 931 have lost blocks, 25 are fatally broken.**
- 221 original Kotlin file names were recovered from coroutine `DebugMetadata` annotations — this is how the feature inventory was reconstructed.
- **Shell template source** (`webview_shell_template_source/`): 6,564 files; `com.htmltoapk.template.*` retains real names (14,141 lines: `WebViewActivity`, `AndroidAPI` JS bridge with ~80 `@JavascriptInterface` methods, `AdMobBridge`, `BridgeGate`, `PdfActivity`, alarm/notification receivers…).

### 1.3 Feature inventory (verified)

| Area | Features confirmed (evidence: routes, classes, strings, metadata) |
|---|---|
| Projects | list + folders (sort/reorder), create from HTML file / folder / URL / PDF, rename, duplicate, delete, move, export ZIP (all-projects / per-project / Android-source-project, optional keystore), ZIP import |
| Editor | `html_editor/{projectId}`, file explorer, 2 MB per-file guard, folder import, index.html detection, file-backed text state |
| Preview | in-app preview + external preview, print-to-PDF, open in browser, `AndroidAPI` bridge note |
| Build | Quick Build + Advanced Build, APK & AAB output, build progress with real log stream (`BuildLogger`), build-output manager (list / share / install / delete), output to `Downloads/HTMLtoAPK` |
| Build engine | on-device repack pipeline — see §1.4 |
| Signing | keystore create/import/verify (RSA-2048/ECDSA, PKCS12+BC), AndroidKeyStore-encrypted password storage with optional biometric, per-project auto-keystores, PEM export, PEPK export for Play App Signing, signature fingerprint display |
| Templates | catalog with 60 covers, 8 working showcase demos, categories, API-driven list, template detail |
| AI | AI app creation (`ai_create`/`ai_session`/`ai_history`), credit system, Firebase sign-in, background generation |
| Monetization | Pro (billing), credits, free-trial AI credits, "Get Pro for Free" video-submission flow |
| Settings | 46-locale in-app language switch incl. **Persian**, appearance, projects & signing, help & feedback, about, legal, rate, DataStore-backed |
| PDF | reader (PdfRenderer + PdfBox), editor, bookmarks, thumbnails, PDF→project conversion |
| Images | uCrop-compatible crop activity used by icon generator |
| Extras | 4 launcher aliases (builder/editor/viewer/PDF) switchable in-app via JobScheduler, jank watchdog, open-source license screens (230 app + 100 template libraries), easter-egg game, in-app Play updates (flexible, req 1204), AdMob+UMP config for generated apps, billing config for generated apps |

### 1.4 Build-engine reconstruction (the core asset)

On-device, no external toolchain. APK path (confidence: high, read directly):
1. `BuildCoordinator` (mutex — one build at a time) → `BuildWorkspaces` temp dir.
2. `TemplateManager` unzips `assets/webview_shell_template.apk` (zip-slip guarded).
3. `ApkResourceTableEditor` patches the package name inside `resources.arsc` in place (UTF-16, length-preserving).
4. `DexRepackager` (org.jf.dexlib2) rewrites all type descriptors `com/htmltoapk/template/*` → user package across every `classes*.dex`.
5. `ApkGenerator.createManifestXml` builds the manifest as **text XML**; `TemplateResourceResolver` resolves `@mipmap/…` refs to literal resource IDs via `ResourceTableReader`; `BinaryXmlEncoder` compiles to Android binary XML; `BinaryXmlDecoder` round-trip-verifies it.
6. `ProjectAssetWriter` injects `assets/www/` (HTML project, `config.json`, AES-GCM `runtime.cache`, splash, PDF).
7. `IconGenerator` scales styled icons into every mipmap slot.
8. `zipDirectory()` re-zips (manifest→dex→arsc ordering, strips old signatures, inline zipalign incl. 16 KB `.so` page alignment).
9. `ApkSignerHelper` signs (Google **apksig**, v1+v2, PKCS12/BC).
AAB path: template `.aab` (ads/no-ads) → protobuf `XmlNode`/`ResourceTable` edits (`AabManifestEditor`, `AabResourcesEditor`) → dex rewrite → re-zip → JAR/v1 signature via BouncyCastle CMS. Plus a separate "export as Android Studio project" renderer (`android_project_template`, AGP 8.13.2 / Kotlin 2.0.21 / Gradle 8.13).

### 1.5 Dependency inventory (evidence-based)

Reconstructed from `META-INF/*.version`, `*.properties`, `res/raw/aboutlibraries.json` (230 libraries) + `template_libraries.json` (100). The jadx `build.gradle` declares **none** of these — it is a stub.

| Category | Libraries |
|---|---|
| UI | Jetpack Compose (ui/foundation/material3/material-icons-extended), Activity-Compose, Navigation-Compose, Lifecycle, Coil, Lottie, uCrop (contract-compatible, Compose re-implementation) |
| DI / data | Hilt, Room (v21 schema), DataStore (preferences + proto), WorkManager, ProfileInstaller, Emoji2 |
| Google Play | Billing 8.0.0, App Update (Play Core), Review, Play Services Auth, Credentials/Blockstore, CHECK_LICENSE |
| Firebase | Auth (+GenericIdp/Recaptcha activities), Analytics, Functions, AppCheck (Play Integrity), Installations, Messaging transport |
| Network | OkHttp, Retrofit |
| Build engine | apksig (Google), dexlib2 (smali project), BouncyCastle (PKCS12/CMS), custom AXML encoder |
| PDF | PdfBox-Android `com.tom_roush` (+ CMap assets), PdfRenderer |
| Content | PdfRenderer templates, `android_project_template` (AppCompat 1.7.1, Material 1.14.0, WebKit 1.12.1, CameraX 1.4.2, Guava; optional play-services-ads 23.6.0 + UMP 4.0.0) |
| Protection | Pairip (Application class, LicenseActivity, licensecheck), R8 |
| AGP/Gradle | **Unknown for the original build** (jadx stub claims AGP 4.2.2 — inconsistent with targetSdk 36; real toolchain unverifiable from artifacts) |

### 1.6 Protected components (must not be modified)

1. **Pairip** (`com.pairip.application.Application`, `licensecheck.*`, `LicenseActivity`, VM-based checks). Untouched in this transformation. Consequence documented in L4.
2. **R8-obfuscated UI** — legally the author's code; technically un-rewritable from decompiled output.
3. **`BuildHost.genuine()`** — self-verification of the builder's signing cert (4 salted SHA-256 digests) gating premium build features. Untouched. Note: on verification exception it fails open (observation, not modified).

---

## 2. What was changed (and nothing else)

### 2.1 Rebuilt APK (`HTML2APK_v1.32-zfix2_rebranded.apk`)

| # | Change | Files |
|---|---|---|
| 1 | App name → **HTML2APK** in all **49 fully-translated locales** (incl. Persian) | `res/values*/strings.xml` — `app_name`, plus 845 brand-token edits across user-visible strings |
| 2 | Fixed dark Material-3 theme, neon cyan/lime | `res/values/styles.xml` — `Theme.HTMLToAPK`: parent `Theme.Material3.Dark` (previous pass's parent `Theme.Material3.Dark.NoActionBar` **does not exist** in the shrunk APK and does not link), `colorPrimary #00D9FF`, `colorSecondary #A6FF00`, window background `#080B12`, cutout `shortEdges` (aapt2 rejects the raw `1`) |
| 3 | Dark palette overrides | `res/values/colors.xml` — `design_dark_default_color_*` → `#080B12` / `#00D9FF` / `#A6FF00` / `#65E6A5` / `#101522` |
| 4 | New launcher artwork | 15 `mipmap-*/ic_launcher*.webp` + 2 `mipmap-anydpi/*.xml` + `drawable/ic_launcher_background.xml` + 2 default-icon assets |
| 5 | **All e-mail flows → `warzonevangard@gmail.com`** | smali: `f9/u9` (settings feedback — was `gamecrafter1520`), `e9/q0` (build-failure reports — was `chat.mobai`), `e9/k` (free-Pro submissions — was `gamecrafter1520`); plus `settings_feedback_summary` in 49 locales |
| 6 | Feedback subject → "HTML2APK - Feedback" | `settings_feedback_subject`, 49 locales |

**Kept deliberately:** the 4 path strings showing `Downloads/HTMLtoAPK/...` — these mirror hardcoded MediaStore paths in code (`KeystoreStorage`); changing display text alone would desync UI from the real folder. Package name `com.basitce.htmltoapk` unchanged (technical identifier; changing it would break Room identity, FileProvider authorities, Firebase config, Play update channel).

### 2.2 Decompiled source project (synchronized to match)

- `java/f9/u9.java` (already pointed at warzonevangard from the previous pass — verified, not double-patched), `java/e9/q0.java`, `java/e9/k.java` → all mailto targets now `warzonevangard@gmail.com`.
- Same 844-edit strings rebrand across 49 locales (Persian `app_name` included — it was missed by the previous pass).
- `Theme.HTMLToAPK` fixed to the buildable form above.
- Icons/theme/colors: already applied by the previous pass; pixel-verified by this audit (mean-abs-diff ≤ 2.6 vs. the 1024-px assets).

### 2.3 Explicitly NOT changed

Pairip (all classes/VM data), licensing flow, billing, Room schema, all Java logic except the 3 e-mail string constants, all assets except the 2 icon PNGs, manifest logic/permissions, native libs, templates, `BuildHost`, `ConfigCrypto`.

---

## 3. Build pipeline used (executable)

```bash
# decode
java -jar apktool.jar d -f -o decoded_apk HTML-to-APK-Builder_v1.32_zfix2.apk
# … apply patches (scripts/patch_apk.py, scripts/patch_emails.py — see patch_log.txt) …
# rebuild
java -jar apktool.jar b decoded_apk -o html2apk_unsigned.apk
# align (4-byte; .so page-aligned)
zipalign -f -p 4 html2apk_unsigned.apk html2apk_aligned.apk
# sign (see §7 note on schemes)
apksigner sign --ks keystore --ks-key-alias html2apk \
  --v1-signing-enabled true --v2-signing-enabled true \
  --out HTML2APK_v1.32-zfix2_rebranded.apk html2apk_aligned.apk
# verify
apksigner verify -v HTML2APK_v1.32-zfix2_rebranded.apk
aapt dump badging HTML2APK_v1.32-zfix2_rebranded.apk
```

---

## 4. Testing report (only executed tests are marked PASS)

| # | Test | Result | Evidence |
|---|---|---|---|
| T1 | Full APK decode (resources + 3 dex → smali) | **PASS** | apktool 3.0.3, exit 0 |
| T2 | Locale-wide name/brand rebrand | **PASS** | 845 string edits / 49 files; `aapt dump badging`: `application-label:'HTML2APK'`, `application-label-fa:'HTML2APK'` |
| T3 | Theme rebuild | **PASS** | after root-cause fix (missing parent style + aapt2 enum) the build links cleanly |
| T4 | Icon replacement | **PASS** | 20 files ported; artwork pixel-matched to 1024-px assets (audit) |
| T5 | E-mail retargeting incl. DEX | **PASS** | built `classes.dex` string pool contains exactly the 2 deduped `warzonevangard` strings; `gamecrafter1520`/`chat.mobai` → 0 occurrences anywhere |
| T6 | APK rebuild | **PASS** | apktool + aapt2 link, exit 0, 52.7 MB |
| T7 | Alignment | **PASS** | `zipalign -c -p 4` → OK; `resources.arsc` Stored (uncompressed, required for targetSdk 30+) |
| T8 | Signing | **PASS** (v3) | `apksigner verify` → **Verifies**; cert `CN=HTML2APK`, SHA-256 `d9d9b273…dd3241`. v1/v2 not emitted by this apksigner despite flags — valid for minSdk 28; see L6 |
| T9 | Manifest integrity | **PASS** | package/versionCode/versionName/minSdk/targetSdk/permissions byte-equivalent (`aapt dump badging`) |
| T10 | Entry-level integrity diff vs original | **PASS** | 763 entries CRC-identical; 364 re-encoded (semantic equivalence spot-checked via `aapt2 dump xmltree`); only intended content changed; qualifier-fold pairs are all below-minSdk variants (v4/v8/v17/v20 < minSdk 28) |
| T11 | Gradle build of decompiled project | **FAIL — root-caused, not runnable** | `dependencies { // TODO: dependencies }` (0 declared vs 100+ imports); AGP 4.2.2 incompatible with targetSdk 36; 43/118 core files carry jadx artifacts; no Android SDK in environment |
| T12 | Runtime launch / full-app QA (21 scenarios of §12) | **NOT EXECUTABLE** | no emulator/device in this sandbox. Nothing is claimed as runtime-passed |
| T13 | In-sandbox decompiled-source compile | **NOT EXECUTABLE** | same root causes as T11; see L1 |

## 5. Known limitations

- **L1 — Full UI redesign not possible from this source.** The Compose UI is R8-obfuscated decompiler output. A screen-by-screen dark-neon redesign requires a clean-room rebuild (§8) or the original source. What WAS delivered: app-wide fixed dark Material-3 theme with neon accents (every XML-theme-consuming surface), new launcher identity, and the design reference in §9.
- **L2 — "Get Pro for Free" cannot be removed at this level.** Entry + route (`free_premium`, `s8.e2`, `e9/k.java`) are compiled into obfuscated DEX; removing them safely requires the original source or clean-room rebuild. Mitigation applied: its submission email now points to `warzonevangard@gmail.com`.
- **L3 — `Downloads/HTMLtoAPK` path strings kept** (code-coupled, §2.1).
- **L4 — Pairip integrity risk.** The rebuild is re-signed; Pairip's checks may reject it at launch (license dialog / exit). This was NOT bypassed (per your own ground rules). Runtime verdict requires a real device install. The untouched original APK remains the guaranteed-working fallback.
- **L5 — No AAB of the builder itself.** The original ships as APK only; the AAB templates inside `assets/` are outputs for user projects and were left untouched.
- **L6 — Signature schemes.** apksigner (build-tools 34) emitted a v3-only signature despite explicit v1/v2 flags; v3-only is valid for Android 9+ which matches minSdk 28 exactly. If you need v1+v2 mirroring the app's own engine, sign with the apksigner from build-tools ≥ 35 or the engine's own `ApkSignerHelper`.
- **L7 — Test signing key.** `HTML2APK_sign.keystore` (alias `html2apk`, store/key pass `html2apk_build_2026`) is a fresh build key for personal testing — replace with your own production key; do not ship this one.
- **L8 — Feedback display text vs other locales:** brand tokens were mechanically replaced in all 49 locales; idiomatic review of translated marketing prose is recommended before any public release.

## 6. Route to a true clean-room rebuild (next stage)

1. Obtain the original source from the author, **or** rebuild from the preserved readable core (~50 hand-written classes: models, apkgenerator, signer, Room, PDF, crop).
2. Re-implement the Compose UI per §9 design system and the recovered route table (28 routes, 3 bottom tabs) — the decompiled tree + `DebugMetadata` names give the screen/ViewModel map.
3. Restore Gradle: AGP 8.x, Kotlin 2.x, the §1.5 dependency list, `compileSdk 36`.
4. Wire `build.gradle` dependencies from `aboutlibraries.json` (machine-readable, already in `res/raw/`).
5. Keep the template assets byte-identical (`webview_shell_template.*`, `android_project_template*/`) — they are the build engine's real inputs.

## 7. Deliverables in this package

| File | Description |
|---|---|
| `HTML2APK_v1.32-zfix2_rebranded.apk` | rebuilt + signed APK (verify before install; see L4) |
| `HTML2APK_sign.keystore` | test signing key (pass: `html2apk_build_2026`) |
| `HTML2APK_source_transformed/` | decompiled project with all source-side patches applied |
| `HTML2APK_transformation_report.md` | this document |
| `patch_log.txt` | machine log of every applied edit |
| `crc_diff.txt` | entry-level diff original ↔ rebranded |
| `checksums.txt` | SHA-256 of all deliverables |

*Original uploaded files were never modified.*
