@file:Suppress("DuplicatedCode")

package org.patternfly.showcase.component

import dev.fritz2.binding.const
import dev.fritz2.binding.handledBy
import dev.fritz2.elemento.elements
import org.patternfly.Notification
import org.patternfly.Severity.DANGER
import org.patternfly.Severity.DEFAULT
import org.patternfly.Severity.INFO
import org.patternfly.Severity.SUCCESS
import org.patternfly.Severity.WARNING
import org.patternfly.classes
import org.patternfly.modifier
import org.patternfly.pfAlert
import org.patternfly.pfAlertActionGroup
import org.patternfly.pfAlertDescription
import org.patternfly.pfButton
import org.patternfly.pfContent
import org.patternfly.pfSection

class AlertComponent {
    val elements = elements {
        intro(
            title = "Alert",
            key = "Alerts",
            text = " are used to notify the user about a change in status or other event. Related design guidelines: ",
            link = ("alerts-and-notifications" to "Alerts and notifications")
        )
        pfSection {
            pfContent {
                h2 { +"Examples" }
            }
            snippet("Types", AlertCode.TYPES) {
                pfAlert(DEFAULT, "Default alert title")
                br {}
                pfAlert(INFO, "Info alert title")
                br {}
                pfAlert(SUCCESS, "Success alert title")
                br {}
                pfAlert(WARNING, "Warning alert title")
                br {}
                pfAlert(DANGER, "Danger alert title")
            }
            snippet("Variations", AlertCode.VARIATIONS) {
                pfAlert(SUCCESS, "Success alert title", closable = true) {
                    pfAlertDescription {
                        p { +"Success alert description. This should tell the user more information about the alert." }
                    }
                    pfAlertActionGroup {
                        pfButton(baseClass = classes("link".modifier(), "inline".modifier())) { +"View details" }
                        pfButton(baseClass = classes("link".modifier(), "inline".modifier())) { +"Ignore" }
                    }
                }
                br {}
                pfAlert(SUCCESS, "Success alert title", closable = true) {
                    pfAlertDescription {
                        p {
                            +"Success alert description. This should tell the user more information about the alert. "
                            a {
                                href = const("#")
                                +"This is a link."
                            }
                        }
                    }
                }
                br {}
                pfAlert(SUCCESS, "Success alert title", closable = true) {
                    pfAlertActionGroup {
                        pfButton(baseClass = classes("link".modifier(), "inline".modifier())) { +"View details" }
                        pfButton(baseClass = classes("link".modifier(), "inline".modifier())) { +"Ignore" }
                    }
                }
                br {}
                pfAlert(SUCCESS, "Success alert title", closable = true)
                br {}
                pfAlert(SUCCESS, "Success alert title")
            }
            snippet("Inline types", AlertCode.INLINE_TYPES) {
                pfAlert(DEFAULT, "Default inline alert title", inline = true)
                br {}
                pfAlert(INFO, "Info inline alert title", inline = true)
                br {}
                pfAlert(SUCCESS, "Success inline alert title", inline = true)
                br {}
                pfAlert(WARNING, "Warning inline alert title", inline = true)
                br {}
                pfAlert(DANGER, "Danger inline alert title", inline = true)
            }
            snippet("Inline Variations", AlertCode.INLINE_VARIATIONS) {
                pfAlert(SUCCESS, "Success alert title", closable = true, inline = true) {
                    pfAlertDescription {
                        p { +"Success alert description. This should tell the user more information about the alert." }
                    }
                    pfAlertActionGroup {
                        pfButton(baseClass = classes("link".modifier(), "inline".modifier())) { +"View details" }
                        pfButton(baseClass = classes("link".modifier(), "inline".modifier())) { +"Ignore" }
                    }
                }
                br {}
                pfAlert(SUCCESS, "Success alert title", closable = true, inline = true) {
                    pfAlertDescription {
                        p {
                            +"Success alert description. This should tell the user more information about the alert. "
                            a {
                                href = const("#")
                                +"This is a link."
                            }
                        }
                    }
                }
                br {}
                pfAlert(SUCCESS, "Success alert title", closable = true, inline = true) {
                    pfAlertActionGroup {
                        pfButton(baseClass = classes("link".modifier(), "inline".modifier())) { +"View details" }
                        pfButton(baseClass = classes("link".modifier(), "inline".modifier())) { +"Ignore" }
                    }
                }
                br {}
                pfAlert(SUCCESS, "Success alert title", closable = true, inline = true)
                br {}
                pfAlert(SUCCESS, "Success alert title", inline = true)
            }
            snippet("Reactive", AlertCode.REACTIVE) {
                pfAlert(DEFAULT, "Close me", closable = true) {
                    closes.map {
                        Notification(DEFAULT, "Notification closed")
                    } handledBy Notification.store.add
                }
            }
        }
    }
}

internal object AlertCode {

    //language=kotlin
    const val TYPES: String = """fun main() {
    render {
        pfAlert(DEFAULT, "Default alert title")
        br {}
        pfAlert(INFO, "Info alert title")
        br {}
        pfAlert(SUCCESS, "Success alert title")
        br {}
        pfAlert(WARNING, "Warning alert title")
        br {}
        pfAlert(DANGER, "Danger alert title")
    }
}
"""

    //language=kotlin
    const val VARIATIONS: String = """fun main() {
    render {
        pfAlert(SUCCESS, "Success alert title", closable = true) {
            pfAlertDescription {
                p { +"Success alert description. This should tell the user more information about the alert." }
            }
            pfAlertActionGroup {
                pfButton(baseClass = classes("link".modifier(), "inline".modifier())) { +"View details" }
                pfButton(baseClass = classes("link".modifier(), "inline".modifier())) { +"Ignore" }
            }
        }
        br {}
        pfAlert(SUCCESS, "Success alert title", closable = true) {
            pfAlertDescription {
                p {
                    +"Success alert description. This should tell the user more information about the alert. "
                    a {
                        href = const("#")
                        +"This is a link."
                    }
                }
            }
        }
        br {}
        pfAlert(SUCCESS, "Success alert title", closable = true) {
            pfAlertActionGroup {
                pfButton(baseClass = classes("link".modifier(), "inline".modifier())) { +"View details" }
                pfButton(baseClass = classes("link".modifier(), "inline".modifier())) { +"Ignore" }
            }
        }
        br {}
        pfAlert(SUCCESS, "Success alert title", closable = true)
        br {}
        pfAlert(SUCCESS, "Success alert title")
    }
}
"""

    //language=kotlin
    const val INLINE_TYPES: String = """fun main() {
    render {
        pfAlert(DEFAULT, "Default inline alert title", inline = true)
        br {}
        pfAlert(INFO, "Info inline alert title", inline = true)
        br {}
        pfAlert(SUCCESS, "Success inline alert title", inline = true)
        br {}
        pfAlert(WARNING, "Warning inline alert title", inline = true)
        br {}
        pfAlert(DANGER, "Danger inline alert title", inline = true)
    }
}
"""

    //language=kotlin
    const val INLINE_VARIATIONS: String = """fun main() {
    render {
        pfAlert(SUCCESS, "Success alert title", closable = true, inline = true) {
            pfAlertDescription {
                p { +"Success alert description. This should tell the user more information about the alert." }
            }
            pfAlertActionGroup {
                pfButton(baseClass = classes("link".modifier(), "inline".modifier())) { +"View details" }
                pfButton(baseClass = classes("link".modifier(), "inline".modifier())) { +"Ignore" }
            }
        }
        br {}
        pfAlert(SUCCESS, "Success alert title", closable = true, inline = true) {
            pfAlertDescription {
                p {
                    +"Success alert description. This should tell the user more information about the alert. "
                    a {
                        href = const("#")
                        +"This is a link."
                    }
                }
            }
        }
        br {}
        pfAlert(SUCCESS, "Success alert title", closable = true, inline = true) {
            pfAlertActionGroup {
                pfButton(baseClass = classes("link".modifier(), "inline".modifier())) { +"View details" }
                pfButton(baseClass = classes("link".modifier(), "inline".modifier())) { +"Ignore" }
            }
        }
        br {}
        pfAlert(SUCCESS, "Success alert title", closable = true, inline = true)
        br {}
        pfAlert(SUCCESS, "Success alert title", inline = true)
    }
}
"""

    //language=kotlin
    const val REACTIVE: String = """fun main() {
    render {
        pfAlert(DEFAULT, "Close me", closable = true) {
            closes.map {
                Notification(DEFAULT, "Notification closed")
            } handledBy Notification.store.add
        }
    }
}
"""
}
