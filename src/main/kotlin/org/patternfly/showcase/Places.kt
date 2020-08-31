package org.patternfly.showcase

import dev.fritz2.dom.Tag
import dev.fritz2.dom.html.render
import org.patternfly.Modifier.light
import org.patternfly.pfContent
import org.patternfly.pfSection
import org.patternfly.pfTitle
import org.patternfly.showcase.component.AlertComponent
import org.patternfly.showcase.component.AlertGroupComponent
import org.patternfly.showcase.component.BadgeComponent
import org.patternfly.showcase.component.BrandComponent
import org.patternfly.showcase.component.ButtonComponent
import org.patternfly.showcase.component.CardComponent
import org.patternfly.showcase.component.ContentComponent
import org.patternfly.showcase.component.DataListComponent
import org.patternfly.showcase.component.DropdownComponent
import org.patternfly.showcase.component.SwitchComponent
import org.w3c.dom.HTMLElement

@OptIn(ExperimentalStdlibApi::class)
object Places {

    const val CONTRIBUTE = "contribute"
    const val DOCUMENTATION = "documentation"
    const val GET_IN_TOUCH = "get-in-touch"
    const val GET_STARTED = "get-started"
    const val HOME = "home"

    private val tags: Map<String, Iterable<Tag<HTMLElement>>> = buildMap {
        put("home", HomePage)
        put(component("alert"), AlertComponent)
        put(component("alert-group"), AlertGroupComponent)
        put(component("badge"), BadgeComponent)
        put(component("brand"), BrandComponent)
        put(component("button"), ButtonComponent)
        put(component("card"), CardComponent)
        put(component("content"), ContentComponent)
        put(component("data-list"), DataListComponent)
        put(component("dropdown"), DropdownComponent)
        put(component("switch"), SwitchComponent)
    }

    fun behaviour(name: String) = "https://www.patternfly.org/v4/design-guidelines/usage-and-behavior/$name"

    fun component(id: String): String = "$DOCUMENTATION:component=$id"

    fun demo(id: String): String = "$DOCUMENTATION:demo=$id"

    fun lookup(place: String): Iterable<Tag<HTMLElement>> = tags.getOrElse(place) { notFound(place) }

    private fun notFound(place: String) = listOf(
        render {
            pfSection(light) {
                pfContent {
                    pfTitle { +"Not Found" }
                    p {
                        +"Page "
                        code { +place }
                        +" not found"
                    }
                }
            }
        })
}