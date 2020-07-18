May 31, 2016

Honestly, I gave up on this. If you want to run with it give it a go. There are only the items pictured in the overview in the mod right now. It's all decoration right now.

May 9, 2015

On the subject of my mod, The Prismatics Mods, did I mention that as far as the beam goes, I believe that the work of coding it has been largely done by the Mojang team already? Here's a clue, it's called a Beacon Beam. All I have to do is lay that beam down, have the prism eject it, and then have the beam color itself based on the last machine that it has gone through. So, it might simply colorize itself and might scintillate based on the bandwidth or beam filters that have been applied to it. The beam will have a strength to it that limits its distance. The distance will be modifiable by a machine possibly called a "Light Injector" and therefore any machine that has this machine as an upgrade to itself.

 

We have to also consider that at least three (3) power mods exist for 1.8 and at least two (2) more will be available before I start making actual Betas and or Release Candidates. To that end I'll be allowing my machines to by powered by those other mods, but the power requirements will be high. We're talking sun power here for the prismatics. Basically lasers, and lasers have traditionally required tons of power, at least in the way they're being envisioned here. After All, this mod currently is about making cdroms or etching gear. Also that's basically what an Injector is.

 

The Injector will work with another machine called Light Collector which will work best in direct Sunlight and significantly less in other light. Basically, it'll be a giant Light Capacitor. Currently the plan is to have it connect to the Injector to put raw light into the beam network you have created to allow said network to function in dark places and at dark times while also giving the beam the energy needed to power machines and to extend itself where possible.

 

Further, I'll likely have the power requirements of these machine set so high, that if you were to hook up the Injectors and Collectors in some manner to a non-prismatic network without the necessary buffers and stabilizers you can expect machines blowing up and other sorts of mayhem in the other mods. That said even the Prismatic network must be maintained carefully so as to avoid the same calamity.

Oh, and Light Collectors and Injectors will most probably be mid to late game in nature requiring expensive and complex material designs to assemble. That said, the plan is to allow Prisms to act in a multi-block mode as well, meaning you that you could plop a whole bunch them together and their collective numbers will increase the beam strength. However, you will be using a lot of mirrors to manage it, else there will be beams going everywhere. I'm still thinking how best to implement that.

 

So, the plan so far is to build the basic beam and have it eject from the side of the prism opposite the facing of the sun. The beam itself will detect mirrors and manage its own distance based on its power attributes and will also manage its own bends based on the mirrors. The beam will stop at any block that is not a mirror or when its distance ability will not support further travel. Initially the beam will be white and the scintillation will come later in another version of the mod. The very first machine as well as the next thing to be made after this is the Prismatic furnace. It will detect the remaining strength left in the beam and turn this internally in to RF and then use that subsequent power to both smelt and do other things. The machines will also feed off of an adjacent beam, so beams don't have to terminate at a machine.

 

Well, that's the plan so far.

May 2, 2015

More thoughts:

The 0.0.3 release will contain:

add mirror that can hang from ceiling
The next step afterward will be to either:

add prismatic furnace
or add the beam
or both.
Future plans:

all machines will possess an upgrade slot that can accept any other machine as an upgrade to itself.
adding a prism will allow a machine to accept more bandwidth with which to operate
an infinite upgrade system will be implemented
the ROY G BIV beam is basically a conduit with 2 to power of 7 frequencies in it. That's 128 bit!
I will not be using bream dispersion, instead the the beams will all be in a single block, this will make programming considerably easier.
machines will become unstable if too close to each others without being in a stability field
machines can be overloaded in both power and usage, overloaded machines become unstable. if not handled in a timely manner they will rip a hole in time and space to another dimension with an unstable wormhole.
this other dimension will hold actual ore needed for higher tier machines.
eventually you'll be able to craft a machine that will keep the dimensional rift open.
the dimension will be known as the rainbow dimension and will possess creatures known to exist in such planes of existence.
More about the beam. I'm torn between two ideas for the beam.

The beam would be white light that travels in the direction you direct it. To represent what frequencies are in it a pulse will travel the length of beam every so often that possess the ROY G BIV pattern that reflects the number of frequencies in it.
Or the beam will consist entirely of the ROY G BIV pattern that represents teh frequencies in it with a white light pulse that travels the length of it at regular intervals.
I feel that both are equally simple to program, and both are probably just as beautiful to look at.

May 1, 2015

Wow! Thanks to help of Dr. Cyano aka Cyanobacterium, I was able to isolate and resolve a pesky little issue with the proper rendering of the refraction mirror in the world. Now to create another refraction mirror that can hang from above with the help of slime balls, and I’m going to add one more feature that causes well all of my blocks to pop off if the block they are on or otherwise attached is removed.

April 28, 2015

Got around to adding the recipe images.

 

I have been thinking more and more about how to implement the rays in the Prismatics Mod. I think the easiest way to implement them is to have what looks like a color band pulse traveling the points where the beam is. The beam will by default be sun-white (is that even a color?) with a frequent ROY G BIV color scheme pulsing through it. The color bands will be modifiable based on whether or not you are using a prism that filters out certain colors. This way you can identify the type of beam you are using. Additionally, I don't have to create a whole lot of code overhead to make this happen and have lots of extra blocks to have to manage. Basically the light beam is a power conduit containing 7 different frequencies of power. The various machines that we'll be creating later on will require different configurations of this light. Don't expect actual fancy science in this as I'm going to mix in a heaping helping of imagination to make it all work. However, unlike power conduits or wire, breaking the beam will have the obvious effect and you'll need special crystals or mirrors to direct or sample the beam.

 

I will likely also have to enlist the aid of certain masters of minecraft to implement dynamic model generation as some of what I expect to do might be beyond the scope of JSON based models. We shall see.

April 27, 2015

Yes it is still very alpha as all I've done today is add the following:

Mirror Frame & recipe
Mirror Panel & recipe
Refraction Mirror & recipe
Everything is still just models and recipes at this point. No actual useable stuff except as decorations.

Well, being a newb I am a bit stumped on what I need to do get my machine idea running. Right now I'm fixated on the premise that I need to compute the angle of the sun and to determine if my prism block can actually see the sun. Then after that is accomplished, I need to determine how best to make the ROY G BIV rays come out the opposing side of the prism.

 

I was also thinking that after that is accomplished we should add a bit of sun glare to the part of the prism that is in fact facing the sun for effect.

 

In addition, I haven't quite decided if the ray seperation should be obtuse or acute. I'm thinking I should go with acute so that I won't need a whole slew of blocks to show the rays and that should make it easier to do the reflection and propagation routines for the mirrors.

April 24, 2015 

 

Now that my Prismatics Mod is out, what I am currently working on is the part that makes a prism seem like a prism. The elements in particular are the best way to compute the sun angle and then after that the best way to make the rays come out the opposing side. Due to an extreme lack of documentation in regards to all of the classes in Forge and Minecraft this process is dreadfully slow. I intend to enlist the aid of several modders that have established good relations with my Minecraft Forge 1.8 Extreme Mod Pack.

 

Until otherwise informed, I have decided that the best way is to acknowledge that the sun rises and sets at fixed times in the Minecraft world. Knowing that, I can simply treat each hour as a change in angle from 270° to 90° and then split the light accordingly. I imagine I can accomplish this feat with a simple get time routine and should yield a more comprehensible result than that obtained by getCelestialAngle() and it's associated siblings. This all said and before you mention it, the prism will check to see if it can see the sun directly or a powerful enough light source to which it is willing to split or otherwise act upon the incoming light.

 

After we tackle this feat; then it is on to the rays themselves, for this and again until otherwise informed, I have decided that I will be extending the Air Block class and modifying it in the way that I modified the glass block to produce the prism itself. This way the rays won't impede the movement of an entity trying to move through them. And then I have to decide on a dispersion factor and how best to arrange the available rays so that what has been split or diverged shall look proper in the world. What I am thinking about the rays is that they'll be little streams of color moving threw the blocks. These blocks might actually be dynamically generated or I might design and entire package of them, the latter probably being better for performance and the former being better for me as a programmer. Perhaps someone can enlighten me as to a way to do this that is not complicated to me nor cumbersome to the client.

 

As far as the rays are concerned, anything blocking them will be treated like if rays had encountered said blockage in the real world; so you might want to mow your yard before using the prism in the middle of  your lawn!

 

After the above is tackled, the next objective will be to create an advanced prism that will use this basic prism in its recipe. The advanced prism will be a machine that accepts up to seven (7) [ROY G BIV]  filters for the express purpose of blocking out rays of light. Which will in turn limited which rays of light will come from the opposing side of the prism.

 

Sometime during all of this or afterwards, I will make the prism detect which type of light it is receiving the choices of course being in the ROY G BIV sequence and ofcourse WHITE and NULL (black [ie not light]). White is actually assumed by default with the sunAngle function.

 

After these great accomplishments you can expect to see reflective mirrors for bending the resulting rays around corners and down through cave systems, etc.

 

And then we'll get to the rest of the mod; for now this is what is on the table and what I feel must be accomplished first.
