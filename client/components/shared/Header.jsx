"use client"
import Link from "next/link"
import Image from "next/image"
import { Button } from "../ui/button"
import { useState } from "react"
import NavItems from "./NavItems"
import MobileNav from "./MobileNav"

const Header = () => {

  const [isAuthenticated, setIsAutheticated] = useState(true);

  return (
    <header className="w-full  border-b">
      <div className="wrapper flex items-center justify-between">
        <Link href="/" className="w-36">
          <Image
            src="/assets/images/logo.svg"
            width={128}
            height={38}
            alt="Evently logo"
          />
        </Link>
        {
          isAuthenticated && (
            <nav className="md:flex-between hidden w-full max-w-xs">
              <NavItems />
            </nav>
          )
        }
        <div className="flex w-32 justify-end gap-3">
          {
            isAuthenticated ? (
              <div>
                <MobileNav />
              </div>
            ) : (
              <Button asChild className="rounded-full" size="lg">
                <Link href="/sign-in">
                  Login
                </Link>
              </Button>
            )
          }
        </div>
      </div>
    </header>
  )
}

export default Header